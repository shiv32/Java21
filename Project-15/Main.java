import com.sun.net.httpserver.*;
import java.net.InetSocketAddress;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    static Map<Integer, String> users = new HashMap<>();
    static int nextId = 1;

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(
                new InetSocketAddress(8080), 0
        );

        server.createContext("/users", exchange -> {

            String method = exchange.getRequestMethod();
            String path = exchange.getRequestURI().getPath();

            String response = "";
            int status = 200;

            if (method.equals("GET") && path.equals("/users")) {

                response = users.toString();

            } else if (method.equals("POST")) {

                String body = new String(
                        exchange.getRequestBody().readAllBytes(),
                        StandardCharsets.UTF_8
                );

                String name = body.replace("{", "")
                        .replace("}", "")
                        .replace("\"", "")
                        .split(":")[1].trim();

                int id = nextId++;
                users.put(id, name);

                response = "Created user: " + id;

                status = 201;

            } else if (method.equals("GET") && path.matches("/users/\\d+")) {

                int id = Integer.parseInt(path.split("/")[2]);

                response = users.containsKey(id)
                        ? users.get(id)
                        : "User not found";

                if (!users.containsKey(id))
                    status = 404;

            } else if (method.equals("PUT") && path.matches("/users/\\d+")) {

                int id = Integer.parseInt(path.split("/")[2]);

                if (users.containsKey(id)) {

                    String body = new String(
                            exchange.getRequestBody().readAllBytes(),
                            StandardCharsets.UTF_8
                    );

                    String name = body.replace("{", "")
                            .replace("}", "")
                            .replace("\"", "")
                            .split(":")[1].trim();

                    users.put(id, name);
                    response = "User updated";

                } else {
                    response = "User not found";
                    status = 404;
                }

            } else if (method.equals("DELETE") && path.matches("/users/\\d+")) {

                int id = Integer.parseInt(path.split("/")[2]);

                if (users.remove(id) != null) {
                    response = "User deleted";
                } else {
                    response = "User not found";
                    status = 404;
                }

            } else {
                response = "Invalid request";
                status = 400;
            }

            exchange.getResponseHeaders().set(
                    "Content-Type", "text/plain; charset=UTF-8"
            );

            byte[] bytes = response.getBytes(StandardCharsets.UTF_8);

            exchange.sendResponseHeaders(status, bytes.length);

            exchange.getResponseBody().write(bytes);
            exchange.close();
        });

        server.start();

        System.out.println("Server running at http://localhost:8080");
    }
}

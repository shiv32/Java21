//import java.util.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // test1();
        //test2();
        test3();

    }

    static void test3() {

        var badWords = new HashSet<String>();

        badWords.add("sex");

        badWords.add("drugs");

        badWords.add("c++");

        Scanner input = new Scanner(System.in);

        String username = input.nextLine();

        if (badWords.contains(username.toLowerCase()))
            System.out.println("Please choose a different user name");
        else
            System.out.println("username : " + username);
    }

    static void test2() {

        var friends = new LinkedList<String>(List.of("Fred", "Wilma", "Barney"));

        for (String name : friends) {

            //  if (name.length() < 5)
            //     friends.remove(name); // Error—concurrent modification

            System.out.println(name);
        }
    }

    static void test1() {
        var friends = new LinkedList<String>();

        ListIterator<String> iter = friends.listIterator();

        iter.add("Fred"); // Fred |
        iter.add("Wilma"); // Fred Wilma |
        iter.previous(); // Fred | Wilma
        iter.set("Barney"); // Fred | Barney

        System.out.println(friends);

    }
}

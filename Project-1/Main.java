
class Test {

    private String name = "Shiv Kumar";

    public String getName() {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello from Java Console App");

        var m_int = 1;
        var m_char = "S";
        var m_string = "shiv";

        var test = new Test();
        Test test2 = new Test();

        System.out.println(m_int);
        System.out.println(m_char);
        System.out.println(m_string);
        
        System.out.println(test.getName());
        System.out.println(test2.getName());

    }
}

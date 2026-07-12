record Person(String name, int age) {
}

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Alice", 30);

        System.out.println(person.name()); // Alice
        System.out.println(person.age());  // 30

        System.out.println(person);

    }
}

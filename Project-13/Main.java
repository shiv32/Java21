class Test {

    private String name;

    Test() {
        this("Unknown name");
    }

    Test(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class Main {
    public static void main(String[] args) {

// 		Test test = new Test("Shiv");
        Test test = new Test();

        //test.setName("Shiv");
        String name = test.getName();

        System.out.println(name);

    }
}
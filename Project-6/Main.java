
class A {

    void show() {
        System.out.println("not Override method");
    }
}

class B extends A {

    @Override //It protects you at compile time.
    //void Show() { //note capital 'S'
    void show() {
        System.out.println("Override method");
    }
}

public class Main {
    public static void main(String[] args) {
        //    B b = new B();
        //    b.show();
        A a = new B();
        a.show();
    }
}

// Interface

interface Payment {

    void pay(double amount);
}

// Abstract class
abstract class BasePayment implements Payment {

    protected String accountName;

    public BasePayment(String accountName) {
        this.accountName = accountName;
    }

    public void printAccount() {
        System.out.println("Account: " + accountName);
    }

    // Common implementation
    public void receipt(double amount) {
        System.out.println("Paid: " + amount);
    }

    // Still abstract
    public abstract void pay(double amount);
}

// Concrete class
class CreditCardPayment extends BasePayment {

    public CreditCardPayment(String accountName) {
        super(accountName);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment...");
        printAccount();
        receipt(amount);
    }
}

// Another concrete class
class UpiPayment extends BasePayment {

    public UpiPayment(String accountName) {
        super(accountName);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI Payment...");
        printAccount();
        receipt(amount);
    }
}

public class Main {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment("Shiv");
        Payment p2 = new UpiPayment("Amitab");

        p1.pay(500);
        
        System.out.println();

        p2.pay(250);
    }
}


public class Main {

    public static void main(String[] args) {

        //------------------------------------------------
        //Traditional switch (requires break)
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Unknown");
        }
        //------------------------------------------------------
        //Modern switch (no break needed)
        //The -> syntax does not fall through, so break is unnecessary.
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Unknown");
        }

        //----------------------------------------------------
        String name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Unknown";
        };

        System.out.println(name);

    }
}

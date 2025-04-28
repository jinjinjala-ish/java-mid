package question;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableDate immute1 = new ImmutableDate(2025,4,28);
        ImmutableDate immute2 = immute1;
        System.out.println("immute1 = " + immute1);
        System.out.println("immute2 = " + immute2);

        System.out.println("2025 -> immute1");
        immute1 = immute1.setYear(2024);
        System.out.println("immute1 = " + immute1);
        System.out.println("immute2 = " + immute2);

    }
}

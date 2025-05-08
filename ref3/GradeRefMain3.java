package ref3;

public class GradeRefMain3 {
    public static void main(String[] args) {

        int price = 10000;

        System.out.println("discount for basic: " + Grade.BASIC.discount(price));
        System.out.println("discount for gold: " + Grade.GOLD.discount(price));
        System.out.println("discount for diamond: " + Grade.DIAMOND.discount(price));
    }
}

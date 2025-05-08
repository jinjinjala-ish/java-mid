package ref3;

public class GradeRefMain {
    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("discount price for basic: " + basic);
        System.out.println("discount price for basic: " + gold);
        System.out.println("discount price for basic: " + diamond);
    }
}

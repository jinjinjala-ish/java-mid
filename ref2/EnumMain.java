package ref2;

public class EnumMain {
    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discountService(Grade.BASIC, price);
        int gold = discountService.discountService(Grade.GOLD, price);
        int diamond = discountService.discountService(Grade.DIAMOND, price);

        System.out.println("discount price for basic = "  + basic);
        System.out.println("discount price for gold = "  + gold);
        System.out.println("discount price for diamond = "  + diamond);
    }
}

package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("discount price for basic: " + basic);
        System.out.println("discount price for gold: " + gold);
        System.out.println("discount price for diamond: " + diamond);
    }
}

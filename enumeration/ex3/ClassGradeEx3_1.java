package enumeration.ex3;

import java.sql.SQLOutput;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("discount price for basic: " + basic);
        System.out.println("discount price for gold: " + gold);
        System.out.println("discount price for diamond: " + diamond);
    }
}

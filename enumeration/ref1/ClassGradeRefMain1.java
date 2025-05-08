package enumeration.ref1;

import java.sql.SQLOutput;

public class ClassGradeRefMain1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("discount price for BASIC = " + basic);
        System.out.println("discount price for GOLD = " + gold);
        System.out.println("discount price for DIAMOND = " + diamond);
    }
}

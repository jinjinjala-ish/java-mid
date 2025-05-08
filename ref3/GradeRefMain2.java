package ref3;

import java.sql.SQLOutput;

public class GradeRefMain2 {
    public static void main(String[] args) {
        int price = 10000;

        int basic = Grade.BASIC.discount(price);
        int gold = Grade.GOLD.discount(price);
        int diamond = Grade.DIAMOND.discount(price);

        System.out.println("discount for basic: " + basic);
        System.out.println("discount for basic: " + gold);
        System.out.println("discount for basic: " + diamond);
    }
}

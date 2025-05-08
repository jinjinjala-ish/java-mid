package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        /*
        //private로 막아서 안됨
        ClassGrade newClassGrade = new ClassGrade();
        int result = discountService.discount(newClassGrade, price);
        System.out.println("할인금액: " + result);
        */
    }
}

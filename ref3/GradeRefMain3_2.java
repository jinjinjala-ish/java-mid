package ref3;

public class GradeRefMain3_2 {
    public static void main(String[] args) {

        int price = 10000;

        Grade[] grades = Grade.values();
        for (Grade g : grades) {
            printDiscount(g, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 할인 금액: " + grade.discount(price));
    }
}

package question.string;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruit = fruits.split(",");

        String join = String.join("->",fruit);
        System.out.println(join);
    }
}

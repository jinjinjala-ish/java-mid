package question.string;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String stringBuilder = new StringBuilder(str).reverse().toString();
        System.out.println(stringBuilder);
    }
}

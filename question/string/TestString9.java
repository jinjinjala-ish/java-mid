package question.string;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}

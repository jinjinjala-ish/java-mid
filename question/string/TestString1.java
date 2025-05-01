package question.string;

public class TestString1 {
    public static void main(String[] args) {
        String url = "htt[://www.example.com";
        boolean bool = url.startsWith("http://");
        System.out.println(bool);
    }
}

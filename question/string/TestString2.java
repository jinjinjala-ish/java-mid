package question.string;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello","java","jvm","spring","jpa"};
        int num = 0;
        int result = 0;

        for (String s : arr) {
            num = s.length();
            System.out.println(s + ": " + num);
            result += num;
        }
        System.out.println("sum = " + result);
    }
}

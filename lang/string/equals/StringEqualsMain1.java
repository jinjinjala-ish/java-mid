package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 동등성 비교: " + (str1 == str2)); //false
        System.out.println("new String() equals() 동일성 비교: " + (str1.equals(str2))); //true

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 동등성 비교: " + (str3 == str4));  //true
        System.out.println("리터럴 equals() 동일성 비교: " + (str3.equals(str4))); //true
    }
}

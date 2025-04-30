package lang.string.method;

public class ChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces ="             Java Programming  ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("소문자로 변환: " + strWithSpaces.toUpperCase());
        System.out.println(strWithSpaces.trim());
        System.out.println(strWithSpaces.trim().toLowerCase());
        System.out.println(strWithSpaces.trim().toUpperCase());
        System.out.println(strWithSpaces.strip());
        System.out.println(strWithSpaces.stripLeading() + ";");
        System.out.println(strWithSpaces.stripTrailing() + ";");
    }
}

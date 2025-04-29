package lang.string.method;

import java.sql.SQLOutput;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //대문자 일부 있음
        String str2 = "hello, java!"; //소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2)); //false
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); //TRUE


        //compareTo(): 사전순으로 비교
        System.out.println("'a' compareTo 'b': " + "b".compareTo("a")); //1
        System.out.println("'a' compareTo 'c': " + "c".compareTo("a")); //2
        System.out.println(str1.compareToIgnoreCase(str2));  //0

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello")); //true
        System.out.println("str1 ends with 'java': " + str2.endsWith("java!")); //true

        System.out.println(str2.indexOf("java!", 1));
    }
}

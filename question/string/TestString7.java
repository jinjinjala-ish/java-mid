package question.string;

import java.sql.SQLOutput;

public class TestString7 {
    public static void main(String[] args) {
        String original = "   hELLO JAVA  ";
        System.out.println(original.strip());
        System.out.println(original.replace("hELLO", "JAVA"));
    }
}

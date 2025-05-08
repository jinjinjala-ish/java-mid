package enumeration;

import enumeration.ex3.Grade;

import  java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        //모든 enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        //모든 enum 반환
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        //String -> enum 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
        /*
        String input = "gold";       //  -> Grade에 없는 문자
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
        */           // 컴파일 오류 발생함
    }
}

package lang.math;

public class MathMain {
    public static void main(String[] args) {
        //기본 연산 메서드
        System.out.println(Math.max(10,29));
        System.out.println(Math.min(10,29));
        System.out.println(Math.abs(-30));
        System.out.println(Math.abs(-0.34));

        System.out.println(Math.ceil(2.9)); //올림
        System.out.println(Math.floor(2.3)); //내림
        System.out.println(Math.round(30.5)); //반올림
        System.out.println(Math.round(39.5)); //반올림
        System.out.println(Math.round(28.5)); //반올림

        //기타 유용한 메서드
        System.out.println(Math.sqrt(9));
        System.out.println(Math.random());
    }
}

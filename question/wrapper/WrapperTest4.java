package question.wrapper;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        //String -> Integer(박싱)
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);


        //Integer -> int(오토 언박싱)
        int intValue = integer1;
        System.out.println("intValue = " + intValue);


        //int -> Integer(오토 박싱)
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}

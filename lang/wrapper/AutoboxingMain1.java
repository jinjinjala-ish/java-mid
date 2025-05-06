package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {

        //Primitive -> Wrapper
        int value = 7;
        /*Integer boxedValue = Integer.valueOf(value);*/
        Integer boxedValue = value; //오토박싱(Auto-boxing) 위와 동일한 코드


        //Wrapper -> Primitive
        /*int unboxedValue = boxedValue.intValue();*/
        int unboxedValue = boxedValue; //오토 언박싱(Auto-unboxing) 위와 동일한 코드

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue " + unboxedValue);
    }
}

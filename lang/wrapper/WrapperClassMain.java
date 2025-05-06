package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);  //new Integer()미래에 삭제 예정, 대신 valueOf()사용 권장
        Integer integerObj = Integer.valueOf(10); //-128~127 자주 사용하는 숫자 값 저장해두고 재사용, 불변
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);

        Long longObj = Long.valueOf(100);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println(newInteger.equals(integerObj)); //true. equals()사용해야 함
        System.out.println(newInteger == integerObj); //false 참조값 비교함
    }
}

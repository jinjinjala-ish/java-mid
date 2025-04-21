package lang.immutable.address;

public class RefMain_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address address = new Address("서웋");
        Address b = address;

        System.out.println(address);
        System.out.println(b);

        //b.setValue("babo");
        System.out.println(address);
        System.out.println(b);
    }
}

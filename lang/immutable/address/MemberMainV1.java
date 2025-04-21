package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 memberV1 = new MemberV1("A", address);
        MemberV1 memberV2 = new MemberV1("B", address);

        //A,B의 처음 주소는 모두 서울
        System.out.println(memberV1);
        System.out.println(memberV2);

        //B의 주소를 부산으로 변경해야 함
        Address address1 = memberV2.getAddress();
        address1.setValue("부산");

        System.out.println(memberV1);
        System.out.println(memberV2);
    }
}

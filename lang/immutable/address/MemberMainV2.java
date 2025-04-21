package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 memberV1 = new MemberV2("A", address);
        MemberV2 memberV2 = new MemberV2("B", address);

        //A,B의 처음 주소는 모두 서울
        System.out.println(memberV1);
        System.out.println(memberV2);

       /* //B의 주소를 부산으로 변경해야 함
        Address address1 = memberV2.getAddress();
        address1.setValue("부산");

        System.out.println(memberV1);
        System.out.println(memberV2);*/
        memberV2.setAddress(new ImmutableAddress("부산"));
        System.out.println(memberV1);
        System.out.println(memberV2);
    }
}

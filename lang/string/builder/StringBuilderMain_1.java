package lang.string.builder;

public class StringBuilderMain_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("b");
        System.out.println("sb = " + sb);

        sb.insert(4, "jAVA");
        System.out.println(sb);

        sb.delete(4,8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String str = sb.toString(); //불변으로 변경
        System.out.println(str);
    }
}

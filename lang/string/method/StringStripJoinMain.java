package lang.string.method;

public class StringStripJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        String joinedStr = String.join("-","A", "B","C");
        System.out.println(joinedStr);

        String result = String.join("-", split);
        System.out.println(result);
    }
}

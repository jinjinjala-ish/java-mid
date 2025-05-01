package question.string;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int numFileName = str.indexOf("hello");
        int extName = str.indexOf(".txt");

        System.out.println("파일이름: " + str.substring(0,extName));
        System.out.println("확장자: " +  str.substring(extName));
    }
}

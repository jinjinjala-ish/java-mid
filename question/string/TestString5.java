package question.string;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";

        String ext = ".txt";

        int extInt = str.indexOf(ext);

        String fileName = str.substring(0,extInt);
        String extName = str.substring(extInt);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}

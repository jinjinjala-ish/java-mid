package question.nested;

public class OuterClass3 {
    public static void myMethod(){

        class LocalClass{
            public void hello(){
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}

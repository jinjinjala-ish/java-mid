package lang.string.Chainning;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
       int result = adder.add(1).add(2).add(3).getValue();  //method Chaining 기법!

        System.out.println("result = " + result);
    }
}

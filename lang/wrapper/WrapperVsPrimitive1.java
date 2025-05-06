package lang.wrapper;

public class WrapperVsPrimitive1 {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; //반복 횟수 설정, 10억
        long startTime, endTime;

        //
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; //오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");
    }
}

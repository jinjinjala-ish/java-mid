package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);
        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println("localtime = " + localTime);

        //계산
        LocalTime plus = localTime.plus(duration);
        System.out.println("plus TIme = " + plus);

        //시간차이
        LocalTime localTime1 = LocalTime.of(9, 0);
        Duration between = Duration.between(plus, localTime1);
        System.out.println("between = " + between);
        System.out.println("시간차이: " + between.getSeconds()/3600);
    }
}

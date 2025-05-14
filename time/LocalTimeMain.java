package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9,10,30);

        System.out.println("현재 시간 = " + localTime);
        System.out.println("지정시간 = " + ofTime);
        ofTime = ofTime.plusSeconds(300);
        System.out.println("지정시간 = " + ofTime);
    }
}

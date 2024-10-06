package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(1, 14, 55);

        System.out.println("현재 시간= "+nowTime);
        System.out.println("지정 시간= "+ofTime);

        LocalTime plusTime = ofTime.plusSeconds(30);

        System.out.println("지정 시간+30s ="+plusTime);


    }
}

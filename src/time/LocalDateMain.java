package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(1999, 4, 22);
        System.out.println("오늘 날짜: "+nowDate);
        System.out.println("지정 날짜: "+ofDate);

        LocalDate plusDate = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d"+plusDate);


    }
}

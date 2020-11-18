package be.intecbrussel;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Ex5ZoneDateTime {

    public static void main(String[] args) {

        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId adelaideZone = ZoneId.of("Australia/Adelaide");

        ZonedDateTime nowHere = ZonedDateTime.now();
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);
        ZonedDateTime nowAdelaide = ZonedDateTime.now(adelaideZone);
        ZonedDateTime nowUTCMinus4 = ZonedDateTime.now(ZoneOffset.ofHours(-4));

        System.out.println(nowHere);
        System.out.println(nowLondon);
        System.out.println(nowSydney);
        System.out.println(nowAdelaide);
        System.out.println(nowUTCMinus4);
    }
}

package be.intecbrussel;

import java.time.Instant;

public class Ex2Time {

    public static void main(String[] args) {

        System.out.println("EPOCH : " + Instant.EPOCH);
        System.out.println("MIN : " + Instant.MIN);
        System.out.println("MAX : " + Instant.MAX);

        Instant now = Instant.now();
        System.out.println("\nNow : " + now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());

        Instant earlier = now.minusSeconds(20);
        System.out.println("\nEarlier : " + earlier);

        Instant later = now.plusSeconds(20);
        System.out.println("\nLater : " + later);

        System.out.println("\nIs now after later ? " + now.isAfter(later));
        System.out.println("Is now before later ? " + now.isBefore(later));

        Instant myTime = now.plusSeconds(7).plusMillis(5).plusNanos(3);
        System.out.println("\nMy time : " + myTime);
    }
}

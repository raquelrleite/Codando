package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2000-04-04");
        LocalDateTime d05 = LocalDateTime.parse("2000-04-04T11:00:14");
        Instant d06 = Instant.parse("2000-04-04T11:00:14-03:00");

        LocalDate d07 = LocalDate.parse("19/12/2017", fmt);
        LocalDate d08 = LocalDate.of(2017,04,01);
        LocalDateTime d09 = LocalDateTime.of(2017,04,01,20,00);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d010 = LocalDateTime.parse("2000-04-04T20:00");
        System.out.println(d010.format(fmt1));


        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        Instant d11 = Instant.parse("2000-04-04T20:00:26Z");
        System.out.println(fmt2.format(d11));


        Instant instant = Instant.now();
        System.out.println(instant);





    }
}

package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now(); // Horário de Londres
        LocalDate date4 = LocalDate.parse("2025-12-25");
        LocalDateTime date5 = LocalDateTime.parse("2025-12-22T08:30");  //Segundos não obrigatório

        Instant date6 = Instant.parse("2025-12-24T08:30:42Z");
        Instant date7 = Instant.parse("2025-12-24T08:30:42-03:00"); //-3, timezone de sp
        DateTimeFormatter datezinho = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date8 = LocalDate.parse("20/07/2025", datezinho);
        LocalDateTime date9 = LocalDateTime.parse("21/07/2025 01:30",  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")); //Da pra fazer assim ao inves de criar outro.
        LocalDate date10 = LocalDate.of(2025, 8, 22);

        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);
        System.out.println("Date3: " + date3);
        System.out.println("Date4: " + date4);
        System.out.println("Date5: " + date5);
        System.out.println("Date6: " + date6);
        System.out.println("Date7: " + date7);
        System.out.println("Date8: " + date8);
        System.out.println("Date9: " + date9);
        System.out.println("Date10: " + date10);










    }
}

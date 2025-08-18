package dataHora;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now(); // Horário de Londres
        LocalDate date4 = LocalDate.parse("2025-12-25");
        LocalDateTime date5 = LocalDateTime.parse("2025-12-22T08:30");  //Segundos não obrigatório

        Instant date6 = Instant.parse("2025-12-20T08:30:42Z");
        Instant date7 = Instant.parse("2025-12-25T08:30:42-03:00"); //-3, timezone de sp

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

        System.out.println("-----------");

        ZonedDateTime zonedNow = ZonedDateTime.now();
        DateTimeFormatter fmtZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());
        System.out.println(fmtZone.format(zonedNow));

        System.out.println("-----------");
        // Cálculos com data/hora

        // Tempo entre uma data e outra
        Period periodo = Period.between(LocalDate.of(2000, 4, 4), LocalDate.now());
        System.out.println("Anos: " + periodo.getYears());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Dias: " + periodo.getDays());
        System.out.println("-----------");


        // Cálculos com data/hora]

        LocalDate semanaPassada = date4.minusDays(5);
        LocalDate semanaQueVem = date10.plusDays(7);


        System.out.println("Semana passada: " + semanaPassada); //25-12-2025
        System.out.println("SemanaQueVem: " + semanaQueVem); //22-08-2025

        Duration duracao = Duration.between(date6, date7);
        System.out.println(duracao.toDays());










    }
}

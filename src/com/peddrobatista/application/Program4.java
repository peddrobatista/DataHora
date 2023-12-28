package com.peddrobatista.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
public class Program4 {
    public static void main(String[] args) {
        // Cáculos com data-hora
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Instanciando uma nova data que é o d04 - 7 dias
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDateTime);

        //Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        //Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // Convertendo data LocalDate pra LocalDateTime
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        // Duration t3 = Duration.between(pastWeekInstant, d06);
        // Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        // System.out.println("t3 dias = " + t3.toDays());
        // System.out.println("t4 dias = " + t4.toDays());
    }
}

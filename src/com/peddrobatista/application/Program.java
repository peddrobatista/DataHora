package com.peddrobatista.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Instanciar o objeto a partir de um padrão
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();

        LocalDate data4 = LocalDate.parse("2023-07-20");
        LocalDateTime data5 = LocalDateTime.parse("2023-07-20T01:30:26");
        Instant data6 = Instant.parse("2023-07-20T01:30:26Z");
        Instant data7 = Instant.parse("2023-07-20T01:30:26-03:00");

        LocalDate data8 = LocalDate.parse("20/12/2023", fmt1);
        LocalDateTime data9 = LocalDateTime.parse("20/07/2023 01:30", fmt2);
        LocalDate data10 = LocalDate.of(2023, 7, 20);
        LocalDateTime data11 = LocalDateTime.of(2023, 7, 20, 1, 30);

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
        System.out.println(data5);
        System.out.println(data6);
        System.out.println(data7);
        System.out.println(data8);
        System.out.println(data9);
        System.out.println(data10);
        System.out.println(data11);
    }
}

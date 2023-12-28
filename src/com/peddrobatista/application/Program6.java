package com.peddrobatista.application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program6 {
    public static void main(String[] args) {
        // Manipulando um Date com Calendar
        // Somando uma unidade de tempo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(sdf.format(d));
    }
}

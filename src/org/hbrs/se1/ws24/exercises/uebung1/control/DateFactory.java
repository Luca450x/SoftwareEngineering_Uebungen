package org.hbrs.se1.ws24.exercises.uebung1.control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFactory {

    public static String createDate() {
        // Aktuelles Datum holen und im Format Monat/Jahr zurückgeben
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
        return LocalDate.now().format(formatter);
    }
}

package org.hbrs.se1.ws24.exercises.uebung1.test;

import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GermanTranslatorTest {

    GermanTranslator translator = new GermanTranslator();

    @Test
    public void testTranslateNumberValid() {
        // Positive Test Cases (Valid inputs)
        assertEquals("eins", translator.translateNumber(1));
        assertEquals("fünf", translator.translateNumber(5));
        assertEquals("zehn", translator.translateNumber(10));
    }

    @Test
    public void testTranslateNumberInvalid() {
        // Negative Test Cases (Invalid inputs)
        assertEquals("Übersetzung der Zahl [0] nicht möglich", translator.translateNumber(0));
        assertEquals("Übersetzung der Zahl [11] nicht möglich", translator.translateNumber(11));
    }

    @Test
    public void testTranslateNumberBoundary() {
        // Boundary Test Cases
        assertEquals("eins", translator.translateNumber(1));   // Lower valid boundary
        assertEquals("zehn", translator.translateNumber(10));  // Upper valid boundary
        assertEquals("Übersetzung der Zahl [0] nicht möglich", translator.translateNumber(0));   // Lower invalid boundary
        assertEquals("Übersetzung der Zahl [11] nicht möglich", translator.translateNumber(11)); // Upper invalid boundary
    }
}

package org.janikalmer.campus02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BMICalculatorTest {

    @Test
    public void testConstructor() {
        BMICalculator bmi = new BMICalculator("Max", "Mustermann", 170, 70, 'm');

        // Normalfall: Überprüfen, ob Werte korrekt gesetzt wurden
        assertEquals("Max", bmi.getFirstname());
        assertEquals("Mustermann", bmi.getLastname());
        assertEquals(170, bmi.getBodyHeight());
        assertEquals(70.0, bmi.getBodyWeight());
        assertEquals('m', bmi.getGender());

        // Setter testen
        bmi.setBodyHeight(180);
        assertEquals(180, bmi.getBodyHeight());

        bmi.setBodyWeight(80);
        assertEquals(80.0, bmi.getBodyWeight());
    }

    @Test
    public void testCalculateBMI() {
        // Normalfälle
        BMICalculator person1 = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        assertEquals(24.22, person1.calculateBMI(), 0.1);

        BMICalculator person2 = new BMICalculator("Lisa", "Müller", 180, 120, 'w');
        assertEquals(37.04, person2.calculateBMI(), 0.1);

        // Edge Cases
        BMICalculator underweight = new BMICalculator("Anna", "Becker", 160, 45, 'w'); // Sehr niedriges Gewicht
        assertEquals(17.58, underweight.calculateBMI(), 0.1);

        BMICalculator overweight = new BMICalculator("Tom", "Klein", 190, 150, 'm'); // Sehr hohes Gewicht
        assertEquals(41.52, overweight.calculateBMI(), 0.1);
    }

    @Test
    public void testCalculateBMICategory() {
        // Normalfälle
        BMICalculator normalWeight = new BMICalculator("Max", "Mustermann", 170, 70, 'm'); // BMI: 24.22 → Kategorie 0
        assertEquals(0, normalWeight.calculateBMICategory());

        BMICalculator overweight = new BMICalculator("Lisa", "Müller", 180, 120, 'w'); // BMI: 37.04 → Kategorie 2
        assertEquals(2, overweight.calculateBMICategory());

        // Edge Cases
        BMICalculator veryUnderweight = new BMICalculator("Anna", "Becker", 170, 45, 'w'); // BMI: 15.6 → Kategorie -2
        assertEquals(-1, veryUnderweight.calculateBMICategory());

        BMICalculator underweight = new BMICalculator("John", "Smith", 175, 55, 'm'); // BMI: 17.96 → Kategorie -1
        assertEquals(-1, underweight.calculateBMICategory());

        BMICalculator highOverweight = new BMICalculator("Tom", "Klein", 190, 150, 'm'); // BMI: 41.52 → Kategorie 2
        assertEquals(2, highOverweight.calculateBMICategory());
    }

    @Test
    public void testGetBMICategoryName() {
        // Normalfälle
        BMICalculator normalWeight = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        assertEquals("Normalgewicht", normalWeight.getBMICategoryName());

        BMICalculator overweight = new BMICalculator("Lisa", "Müller", 180, 120, 'w');
        assertEquals("Sehr starkes Übergewicht", overweight.getBMICategoryName());

        BMICalculator underweight = new BMICalculator("John", "Smith", 175, 55, 'm');
        assertEquals("Untergewicht", underweight.getBMICategoryName());

        BMICalculator highOverweight = new BMICalculator("Tom", "Klein", 190, 150, 'm');
        assertEquals("Sehr starkes Übergewicht", highOverweight.getBMICategoryName());
    }
}



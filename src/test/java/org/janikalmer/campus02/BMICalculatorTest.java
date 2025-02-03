package org.janikalmer.campus02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    public class BMICalculatorTest {
        @Test
        public void testConstructor() {
            BMICalculator bmi = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
            assertEquals("Max", bmi.getFirstname());
            assertEquals("Mustermann", bmi.getLastname());
            assertEquals(170, bmi.getBodyHeight());
            assertEquals(70.0, bmi.getBodyWeight());
            assertEquals('m', bmi.getGender());
        }

        @Test
        public void testCalculateBMI() {
            // Test 1: Person mit bodyHeight = 170 cm, bodyWeight = 70 kg
            BMICalculator person1 = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
            assertEquals(24.22, person1.calculateBMI(), 0.01);

            // Test 2: Person mit bodyHeight = 180 cm, bodyWeight = 120 kg
            BMICalculator person2 = new BMICalculator("Lisa", "Müller", 180, 120, 'w');
            assertEquals(37.04, person2.calculateBMI(), 0.01);
        }

        @Test
        public void testCalculateBMICategory() {
            // Test 1: Frau mit BMI 24.22 → Erwartete Kategorie: 1
            BMICalculator person1 = new BMICalculator("Lisa", "Müller", 170, 70, 'w');
            assertEquals(1, person1.calculateBMICategory());

            // Test 2: Mann mit BMI 37.04 → Erwartete Kategorie: 2
            BMICalculator person2 = new BMICalculator("Max", "Mustermann", 180, 120, 'm');
            assertEquals(2, person2.calculateBMICategory());
        }

        @Test
        public void testGetBMICategoryName() {
            // Test 1: BMI-Kategorie 1 → Erwartete Ausgabe: "Übergewicht"
            BMICalculator person1 = new BMICalculator("Lisa", "Müller", 170, 70, 'w'); // BMI = 24.22, Kategorie = 1
            assertEquals("Übergewicht", person1.getBMICategoryName());

            // Test 2: BMI-Kategorie 2 → Erwartete Ausgabe: "Sehr starkes Übergewicht"
            BMICalculator person2 = new BMICalculator("Max", "Mustermann", 180, 120, 'm'); // BMI = 37.04, Kategorie = 2
            assertEquals("Sehr starkes Übergewicht", person2.getBMICategoryName());
        }
    }


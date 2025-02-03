package org.janikalmer.campus02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    public class BMICalculatorTest {
        @Test
        public void testConstructor() {
            BMICalculator bmi = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
            assertEquals(170, bmi.getBodyHeight());
            assertEquals(70.0, bmi.getBodyWeight());
        }

        @Test
        public void testCalculateBMI() {
            BMICalculator bmi = new BMICalculator("Lisa", "Müller", 180, 120, 'w');
            assertEquals(37.04, bmi.calculateBMI(), 0.01);
        }

        @Test
        public void testCalculateBMICategory() {
            BMICalculator bmi = new BMICalculator("John", "Doe", 170, 70, 'm');
            assertEquals(0, bmi.calculateBMICategory());
        }

        @Test
        public void testGetBMICategoryName() {
            BMICalculator bmi = new BMICalculator("Jane", "Doe", 160, 80, 'w');
            assertEquals("Übergewicht", bmi.getBMICategoryName());
        }
    }


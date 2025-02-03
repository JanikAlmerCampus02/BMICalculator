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
    }


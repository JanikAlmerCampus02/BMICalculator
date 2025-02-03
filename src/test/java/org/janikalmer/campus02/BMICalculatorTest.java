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
    }


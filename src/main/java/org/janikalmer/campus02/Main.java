package org.janikalmer.campus02;

public class Main {
    public static void main(String[] args) {
        // Beispielinstanzen für den BMICalculator
        BMICalculator person1 = new BMICalculator("Max", "Mustermann", 170, 70, 'm');
        BMICalculator person2 = new BMICalculator("Lisa", "Müller", 180, 120, 'w');

        // BMI und Kategorien berechnen
        printBMI(person1);
        printBMI(person2);
    }

    public static void printBMI(BMICalculator person) {
        System.out.println("------------------------------------------------");
        System.out.println("Name: " + person.getFirstname() + " " + person.getLastname());
        System.out.println("Größe: " + person.getBodyHeight() + " cm");
        System.out.println("Gewicht: " + person.getBodyWeight() + " kg");
        System.out.println("BMI: " + person.calculateBMI());
        System.out.println("Kategorie: " + person.getBMICategoryName());
        System.out.println("------------------------------------------------");
    }
}

package ProgrmowanieObiektowe;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza licze");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga licze");
        int secondNumber = scanner.nextInt();

        KlasyCalculator calculator = new KlasyCalculator();

        int addition = calculator.add(firstNumber,secondNumber);
        int subtraction = calculator.sub(firstNumber,secondNumber);
        int multiplication = calculator.mult(firstNumber,secondNumber);
        int division = calculator.div(firstNumber,secondNumber);
        int modulo = calculator.mod(firstNumber,secondNumber);

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnozenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik modulo: " + modulo);

    }

}

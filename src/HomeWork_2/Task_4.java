package HomeWork_2;

import java.util.Scanner;

public class Task_4 {
    /*Даны два действительных числа. Найти среднее арифметическое этих чисел.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the FIRST number: ");
        float firstNumber = scanner.nextInt();
        System.out.println("Enter the SECOND number: ");
        float secondNumber = scanner.nextInt();
        float arithmeticalMean = (firstNumber + secondNumber) / 2;
        System.out.println("Arithmetical mean = " + arithmeticalMean);
    }
}

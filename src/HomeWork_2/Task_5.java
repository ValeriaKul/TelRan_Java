package HomeWork_2;

import java.util.Scanner;

public class Task_5 {
    /*Даны катеты прямоугольного треугольника. Найти его гипотенузу.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the FIRST cathetus:");
        double firstSide = scanner.nextDouble();
        System.out.println("Enter the SECOND cathetus:");
        double secondSide = scanner.nextDouble();
        double hipotenuse = Math.sqrt(Math.pow(firstSide, 2) + (Math.pow(secondSide, 2)));
        System.out.printf("The hypotenuse of a right triangle is " + "%.2f", hipotenuse);
    }
}

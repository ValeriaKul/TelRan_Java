package HomeWork_3;

import java.util.Scanner;

public class Task_5 {
    /*
    Implement the program that prints to screen the results of addition, subtraction,
    multiplication and division of two numbers.
    Each of the arithmetic operations should be implemented as a separate method.
     */
    public static void main(String[] args) {
        Task_5 calculator = new Task_5();
        double firstDoubleNumber = calculator.enterNumber("FIRST");
        double secondDoubleNumber = calculator.enterNumber("SECOND");
        calculator.printResult("addition", calculator.addition(firstDoubleNumber, secondDoubleNumber));
        calculator.printResult("subtraction", calculator.subtraction(firstDoubleNumber, secondDoubleNumber));
        calculator.printResult("multiplication", calculator.multiplication(firstDoubleNumber, secondDoubleNumber));
        calculator.printResult("division", calculator.division(firstDoubleNumber, secondDoubleNumber));
    }

    public double addition(double firstDoubleNumber, double secondDoubleNumber) {
        return firstDoubleNumber + secondDoubleNumber;
    }

    public double subtraction(double firstDoubleNumber, double secondDoubleNumber) {
        return firstDoubleNumber - secondDoubleNumber;
    }

    public double multiplication(double firstDoubleNumber, double secondDoubleNumber) {
        return firstDoubleNumber * secondDoubleNumber;
    }

    public double division(double firstDoubleNumber, double secondDoubleNumber) {
        return firstDoubleNumber / secondDoubleNumber;
    }

    public double enterNumber(String serialNumber) {
        System.out.println("Enter the " + serialNumber + " number and press ENTER:");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        return number;
    }

    public void printResult(String typeOfOperation, double resultOfOperation) {
        System.out.println();
        System.out.printf("Result of " + typeOfOperation + " is " + "%.2f", resultOfOperation);
    }


}

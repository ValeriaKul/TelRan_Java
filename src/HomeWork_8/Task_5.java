package HomeWork_8;

import java.util.Scanner;

public class Task_5 {
    /*Implement the method that check if the given number is prime*/
    public static void main(String[] args) {
        checkNumber();
        test(3, true);
        test(11, true);
        test(10, false);
    }

    private static void checkNumber() {
        printMessage("Enter the number: ");
        var scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPrime(number)) {
            printMessage("The number is prime.");
        } else {
            printMessage("The number isn't prime.");
        }
    }

    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    private static void printMessage (String text) {
        System.out.println(text);
    }

    private static void test (int number, boolean expectedResult) {
        boolean realResult = isPrime(number);
        if (realResult == expectedResult) {
            System.out.println("Test 'isPrime' is CORRECT.");
        } else {
            System.out.println("Test 'isPrime' is WRONG.");
        }
    }
}


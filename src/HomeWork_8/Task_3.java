package HomeWork_8;

import java.util.Scanner;

public class Task_3 {
    //    Implement the program that read Integers from Scanner and prints the sum of all integers were input.
    //    The program will finish when 0 input.
    public static void main(String[] args) {
        printMessage("Hello! ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int summ = 0;

        do {
            printMessage("Input a number for sum or '0' for EXIT: ");
            number = scanner.nextInt();
            summ = summ + number;
        }
        while (number != 0);
        printMessage("SUM: " + summ);
        printMessage("Thank you! Bye!");

    }

    private static void printMessage(String text) {
        System.out.print(text);
        System.out.println();
    }


}

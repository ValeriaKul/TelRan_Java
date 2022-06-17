package HomeWork_8;

import java.util.Scanner;

public class Task_4 {
    /* Given two integers year1 and year2. Implement method that returns the quantity of leap years between year1
    and year2.Example: getQuantityOfLeapYears (2000,2022) -> 6*/
    public static void main(String[] args) {

        int year1 = enterYear("FIRST YEAR ");
        int year2 = enterYear("SECOND YEAR ");
        run(year1, year2);

    }

    private static int enterYear(String text) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Enter " + text);
        int year = scanner.nextInt();
        return year;
    }

    private static void run(int year1, int year2) {
        if (year1 < year2) {
            printMessage("The quantity of leap years between year1 and year2 is " + count(year1, year2));
        } else {
            printMessage("The quantity of leap years between year1 and year2 is " + count(year2, year1));
        }
    }

    private static int count(int year1, int year2) {
        int countOfLeapYear = 0;
        int count = year1;
        while (count <= year2) {
            if (isLeap(count)) {
                countOfLeapYear++;
            }
            count++;
        }
        return countOfLeapYear;
    }

    private static boolean isLeap(int year) {
        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    private static void printMessage(String text) {
        System.out.println(text);
    }
}

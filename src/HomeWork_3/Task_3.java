package HomeWork_3;

import java.util.Scanner;

public class Task_3 {
    /*
    Implement the method that convert the given amount in EUR to amount in USD
     */
    public static void main(String[] args) {
        Task_3 convert = new Task_3();
        double eurSum = convert.enterEurSum();
        System.out.println("Amount in USD: " + convert.convertToUsd(eurSum, 1.07));

    }

    public double enterEurSum () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many EUR do you want to change to USD? Enter amount: ");
        double eurSum = scanner.nextDouble();
        return eurSum;
    }

    public double convertToUsd (double eurSum, double exchangeRate) {
        double usdSum = eurSum * exchangeRate;
        return usdSum;
    }

}

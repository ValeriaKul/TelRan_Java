package HomeWork_1;

import java.util.Scanner;

public class HomeWork_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input radius:");
        int x = scanner.nextInt();

        System.out.println("The area of a circle with radius " + x + " is " + Math.PI*x*x);

    }
}

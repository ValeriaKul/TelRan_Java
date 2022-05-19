package HomeWork_1;

import java.util.Scanner;

public class HomeWork_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side X");
        int x = scanner.nextInt();
        System.out.println("Input side Y");
        int y = scanner.nextInt();

        System.out.println("The area of the rectangle with side X = " + x + " and side Y = " + y + " is " + (x * y) + ".");

    }
}

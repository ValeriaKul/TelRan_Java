package HomeWork_2;

import java.util.Scanner;

public class Task_2 {
    /*Write a program that asks the user’s name and displays “Your name start with char …..” on the screen.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your NAME:");
        String userName = scanner.nextLine();
        System.out.println("Your name start with char " + userName.charAt(0));
    }
}

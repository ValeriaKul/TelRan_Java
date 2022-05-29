package HomeWork_3;

import java.util.Scanner;

public class Task_4 {
    /*
    Implement the method that calculates how many extra calories there will be if you’ll buy a pizza with a diameter
    of n cm (parameter of method) instead of a pizza with a diameter of 24 cm. To solve this, let's assume
    that each square centimeter of pizza is 40 calories.
     */
    public static void main(String[] args) {
        Task_4 pizza = new Task_4();
        int newDiameter = pizza.enterDiameterOfPizza();
        double extraCalories = pizza.calculateExtraCalories(pizza.calculateSquare(newDiameter), pizza.calculateSquare(24));
        System.out.printf("Extra calories = " + "%.2f", extraCalories);
    }

    public int enterDiameterOfPizza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the diameter of your pizza: ");
        int diameterOfPizza = scanner.nextInt();
        return diameterOfPizza;
    }

    public double calculateSquare(int diameter) {
        double squareOfPizza = Math.PI * Math.pow(diameter, 2) / 4;
        return squareOfPizza;
    }

    public double calculateExtraCalories(double squareOfPizza, double squareOfPizza24) {
        return (40 * (squareOfPizza - squareOfPizza24));
    }

}

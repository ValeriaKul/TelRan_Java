package HomeWork_2;

import java.util.Scanner;

public class Task_3 {
    /*Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the side of the cube: ");
        int side = scanner.nextInt();
        double volume = Math.pow(side, 3);
        double sideArea = 6 * Math.pow(side, 2);
        System.out.println("Cube volume = " + volume + ", side surface area of a cube = " + sideArea);
    }
}

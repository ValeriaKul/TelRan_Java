package HomeWork_2;

import java.util.Scanner;

public class Task_3 {
    /*Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the side of the cube: ");
        int side = scanner.nextInt();
        int volume = side * side * side;
        int sideArea = 4 * side * side;
        System.out.println("Cube volume = " + volume + ", side surface area of a cube = " + sideArea);
    }
}

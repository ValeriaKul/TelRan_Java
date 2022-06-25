package HomeWork_9;

public class Task_3 {
    //Реализовать метод, который возвращает сумму элементов заданного массива int{10, 3, 23, 5, -9} -> 32
    public static void main(String[] args) {
        System.out.println("Sum of numbers is " + run());

    }

    private static int[] createArray() {
        int[] newArray = new int[]{10, 3, 23, 5, -9};
        return newArray;
    }

    private static int sumOfNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    private static int run() {
        int sumOfNumbers = sumOfNumbers(createArray());
        return sumOfNumbers;
    }
}

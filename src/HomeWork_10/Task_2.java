package HomeWork_10;

import java.util.Arrays;

public class Task_2 {
    // Реализуйте метод, возвращающий новый массив, который является заданным массивом в обратном порядке
    // {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}

    public static void main(String[] args) {

        createSecondArray();
    }

    private static int[] createSecondArray() {
        int[] firstArray = new int[]{10, 3, 3, 5, -9};
        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[secondArray.length - i - 1] = firstArray[i];
        }
        return secondArray;
    }
}

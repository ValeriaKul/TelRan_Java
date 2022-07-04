package HomeWork_10;

import java.util.Arrays;

public class Task_4 {
    // Предположим, что есть два массива чисел, каждый из которых отсортирован в порядке возрастания.
    // Реализуйте метод int[] merge(int[], int[]), который объединяет эти массивы в один отсортированный массив.
    // ({1,4,6,8},{3,7}) ->{1,3, 4,6,7,8}({12,19},{3,7}) -> {3,7,12,19}

    public static void main(String[] args) {
        int[] firstArray = new int[]{2, 4, 6, 8};
        int[] secondArray = new int[]{1, 3, 5, 7};
        int[] newArray = merge(firstArray, secondArray);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(bubbleSort(newArray)));
    }

    private static int[] merge(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            newArray[count] = firstArray[i];
            count++;
        }
        for (int i = 0; i < secondArray.length; i++) {
            newArray[count] = secondArray[i];
            count++;
        }
        return newArray;
    }

    private static int[] bubbleSort(int[] newArray) {

        for (int i = newArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }
}

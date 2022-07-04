package HomeWork_10;

import java.util.Arrays;

public class Task_1 {
    // Реализовать метод, который возвращает новый массив целых чисел.
    // Каждый элемент массива является следующей степенью двойки.
    // Длина массива задана n (максимальное значение n равно 30. Как вы думаете, почему?)
    // powerOfTwo (5) -> {1,2,4,8,16}

    // 2^31 = 2147483648, что на 1 больше максимального значения int. Соответственно, мах n = 30 именно по этой причине.

    public static void main(String[] args) {

        System.out.println(Arrays.toString(powerOfTwo(5)));
    }

    private static int [] powerOfTwo (int arrayLength) {
        int [] newArray = new int[arrayLength];
        int n = 0;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) Math.pow(2, n);
            n++;
        }
        return newArray;
    }
}

package HomeWork_10;

import java.sql.Array;
import java.util.Arrays;

public class Task_3 {
    // Реализуйте метод, который создает заданный массив в обратном порядке.
    // Это похоже на предыдущее, но вы должны решить его без нового массива
    // {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
    public static void main(String[] args) {

        int[] array = createArray();
        System.out.println(Arrays.toString(array));
    }

    private static int[] createArray() {
        int [] array = new int[] {10, 3, 3, 5, -9};
        for (int i = 0; i < array.length / 2; i++) {
            int firstNumber = array[i];
            int lastNumber = array[array.length - i - 1];
            array[i] = lastNumber;
            array[array.length - i - 1] = firstNumber;
        }
        return array;
    }
}



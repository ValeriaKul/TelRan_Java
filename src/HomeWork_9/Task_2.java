package HomeWork_9;

public class Task_2 {
    //    Реализуйте метод, который возвращает индекс самого большого элемента заданного массива int{10, 33, 3, 5, -9} -> 1
    public static void main(String[] args) {
        System.out.println("Индекс самого большого элемента массива - " + run());

    }

    private static int run() {
        int index = maxValue(createArray());
        return index;
    }

    private static int[] createArray() {
        int[] newArray = new int[]{10, 33, 3, 5, -9};
        return newArray;
    }

    private static int maxValue(int[] array) {
        int max = array[0];
        int indexOfMaxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            int count = array[i];
            if (max < count) {
                max = count;
                indexOfMaxNumber = i;
            }
        }
        return indexOfMaxNumber;
    }
}

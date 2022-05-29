package HomeWork_3;

public class Task_1 {
    /*Напишите метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d — целочисленные входные параметры этого метода.*/
    public int mathOperation1(int a, int b, int c, int d) {
        int mathOperationResult = a * (b + (c / d));
        return mathOperationResult;
    }
}

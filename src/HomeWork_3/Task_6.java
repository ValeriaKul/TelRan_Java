package HomeWork_3;

public class Task_6 {
    /*
    Напишите метод, присваивающий переменной "a" случайное значение из диапазона с плавающей точкой,
    и выведи округлённое до 3 знаков после запятой.
     */
    public static void main(String[] args) {
        double a = Math.random() * 200;
        System.out.printf("Our number is " + "%.3f", a);
    }

}

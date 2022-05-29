package HomeWork_3;

public class Task_2 {
    /*
    Напишите метод, которому в качестве параметра передаётся строка, обозначающая имя.
    Метод должен вернуть приветственное сообщение: «Hello, переданное_имя!».
    Выведи приветствие в консоль.
     */

    public static void main(String[] args) {
        System.out.println(printHelloName("Peter"));
    }

    public static String printHelloName(String name) {
        return ("Hello, " + name + "!");
    }
}

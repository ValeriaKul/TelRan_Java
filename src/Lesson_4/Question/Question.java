package Lesson_4.Question;

public class Question {
    public static void main(String[] args) {
        System.out.println("Hello everyone!");
        String s = askQuestion();
        System.out.println(s);
    }

   public static String askQuestion () {
        System.out.println("How long does it take to learn java?");

        return "My answer";
    }
}

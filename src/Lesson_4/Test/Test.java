package Lesson_4.Test;

import Lesson_4.Question.Question;

public class Test {
    public static void main(String[] args) {
        String s = Question.askQuestion();
        System.out.println(s);
        System.out.println(answer(s));
    }

    private static String answer (String s) {
        String answer = Question.askQuestion();
        return answer;
    }
}

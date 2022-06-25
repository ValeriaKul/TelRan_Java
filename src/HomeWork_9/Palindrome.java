package HomeWork_9;

import java.util.Objects;

public class Palindrome {
    //    Напишите метод, который проверяет, является ли данная строка палиндромом.
//    Палиндром — это фраза, которая одинаково читается спереди и сзади.
    private String[] modifyText(String text) {
        String text2 = text.toLowerCase();
        text2 = text2.replace(" ", "");
        return createArray(text2);
    }

    private String[] createArray(String text2) {
        String[] textArray = new String[text2.length()];
        for (int i = 0; i < text2.length(); i++) {
            textArray[i] = text2.substring(i, i + 1);
        }
        return textArray;
    }

    boolean isPalindrome(String text) {

        String[] text2 = modifyText(text);
        boolean result = true;
        for (int i = 0; i < text2.length; i++) {
            result = result && (Objects.equals(text2[i], text2[text2.length - i - 1]));
        }
        return result;
    }
}

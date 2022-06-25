package HomeWork_9;

public class Task_1 {
    /*Напишите метод, который принимает строку и два символа.
    В результате он возвращает заданную строку, где каждый первый символ был заменен вторым символом.
    Вы должны использовать только методы length() и charAt() класса String.
    Например: «Я всегда делаю домашнее задание», «a», «A» -> «Я всегда делаю домашнее задание».*/

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String message = "Я всегда делаю домашнее задание";
        char firstSymbol = 'а';
        char secondSymbol = 'А';

        String[] newArray = modifyArray(createArray(message), firstSymbol, secondSymbol);
        System.out.println("New String = " + modifyMessage(newArray));
    }

    private static String[] createArray(String text) {
        String[] textArray = new String[text.length()];
        for (int i = 0; i < textArray.length; i++) {
            textArray[i] = String.valueOf(text.charAt(i));
        }
        return textArray;
    }

    private static String[] modifyArray(String[] firstArray, char firstSymbol, char secondSymbol) {
        String[] secondArray = new String[firstArray.length];
        for (int i = 0; i < secondArray.length; i++) {
            if (firstArray[i].equals(String.valueOf(firstSymbol))) {
                secondArray[i] = String.valueOf(secondSymbol);
            } else {
                secondArray[i] = firstArray[i];
            }
        }

        return secondArray;
    }

    private static String modifyMessage(String[] modifyArray) {
        String modifyText = "";
        for (int i = 0; i < modifyArray.length; i++) {
            modifyText = modifyText + modifyArray[i];
        }
        return modifyText;
    }
}


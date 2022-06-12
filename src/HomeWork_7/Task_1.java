package HomeWork_7;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        boolean condition = true;
        while (condition) {
            printMessages("Enter month number from 1 to 12 or 0 for exit: ");
            int number = greetings();
            if (number == 0) {
                condition = false;
                printMessages("Thank you! Bye!");
            } else {
                String nameOfMonth = monthDefinition(number);
                if (nameOfMonth.length() < 10) {
                    printMessages(nameOfMonth);
                    printMessages(nameOfSeason(number));
                } else {
                    printMessages(nameOfMonth);
                }
            }
        }
    }

    /* Реализовать программу, которая берет из Сканера целое число – номер дня месяца.*/
    public static int greetings() {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();
        return numberOfMonth;
    }

    /* Реализуйте метод, который принимает это целое число и возвращает строку месяца или сообщение:
    «недопустимый аргумент». Пример: getMonthString(3) -> март;*/
    public static String monthDefinition(int numberOfMonth) {
        String[] namesOfMonths = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        String nameOfMonth = " ";
        if (numberOfMonth >= 1 && numberOfMonth <= 12) {
            nameOfMonth = namesOfMonths[numberOfMonth - 1];
        } else {
            nameOfMonth = "WRONG NUMBER! Please, enter correct number (from 1 to 12) ";
        }
        return nameOfMonth;
    }

    /*Реализуйте метод, который принимает номер месяца и возвращает время года (зима, весна, лето или осень),
    к которому относится месяц.*/

    public static String nameOfSeason(int numberOfMonth) {
        String season = " ";
        if (numberOfMonth == 12 || numberOfMonth == 1 || numberOfMonth == 2) {
            season = "Winter";
        }
        if (numberOfMonth == 3 || numberOfMonth == 4 || numberOfMonth == 5) {
            season = "Spring";
        }
        if (numberOfMonth == 6 || numberOfMonth == 7 || numberOfMonth == 8) {
            season = "Summer";
        }
        if (numberOfMonth == 9 || numberOfMonth == 10 || numberOfMonth == 11) {
            season = "Autumn";
        }
        return season;
    }

    public static void printMessages(String textMessage) {
        System.out.println(textMessage);
        System.out.println();
    }

}

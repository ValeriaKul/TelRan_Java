package HomeWork_7;

import java.util.Scanner;

public class Task_2 {
    /* Представьте, что вы пишете программу для магазина. В нем должно быть объявлено условие акции:
    «Вы можете получить BestWowSomething по цене 89,99$. Но если вы покупаете две вещи, то получаете
    скидку 10% на все, а если покупаете три и более, то скидка будет 15% на все». Затем он должен
    спросить пользователя, сколько вещей пользователь хочет купить. Если пользователь вводит что-то большее,
     чем 0, программа должна вывести сумму покупки, иначе выведет "Жалко. Увидимся в следующий раз" */

    public static void main(String[] args) {
        printMessage("You can get the BestWowSomething by the price 89.99$.");
        printMessage("But if you buy two articles then you get the discount 10% of all and if you buy three and more the discount will be 15% of all");
        boolean condition = true;
        while (condition) {
            printMessage("How many articles do you want to buy? Make your choice: ");
            int clientChoice = choice();
            if (clientChoice == 0) {
                printMessage("It's a pity. See you next time!");
                condition = false;
            } else {
                printMessage("Final price is " + String.format("%.2f", sumWithDiscount(clientChoice)) + "$");
            }
        }

    }

    public static int choice() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static double sumWithDiscount(int choice) {
        double firstArticle = 89.99;
        double finalAmount = 0;
        if (choice == 1) {
            finalAmount = firstArticle;

        }
        if (choice == 2) {
            finalAmount = firstArticle * choice * 0.9;
        }
        if (choice >= 3) {
            finalAmount = firstArticle * choice * 0.85;
        }
        return finalAmount;

    }

    public static void printMessage(String text) {
        System.out.println(text);
        System.out.println();
    }
}

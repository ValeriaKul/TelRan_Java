package HomeWork_8;

public class Task_1 {
//    Implement method “countdown” that prints numbers from 5 to 1, than prints „start“. Implement it
//    using both type of loop countdown() -> 5
public static void main(String[] args) {
    System.out.println("While");
    countDownWhile();
    System.out.println("Do...While");
    doCountDownWhile();
}

private static void countDownWhile () {
    int i = 5;
    while (i > 0 ) {
        System.out.println(i);
        i--;
    }
    System.out.println("Start");
}

    private static void doCountDownWhile () {
        int i = 5;
       do {
           System.out.println(i);
           i--;}
        while (i > 0 );
        System.out.println("Start");
    }

}

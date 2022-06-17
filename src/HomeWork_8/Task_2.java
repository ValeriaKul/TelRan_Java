package HomeWork_8;

public class Task_2 {
    //    Given two integers number1 and number2. Implement method that returns the sum of all numbers between number1
//    and number2 that divisible by 3.Example: getSumDivisibleByTreeNumbers(20,10) -> 45
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 10;
        if (number1 < number2) {
            System.out.println("the Sum of all numbers between number1 and number2 that divisible by 3 is " + count(number1, number2));
        } else {
            System.out.println("the sum of all numbers between number1 and number2 that divisible by 3 is " + count(number2, number1));
        }
    }

    private static int count(int number1, int number2) {
        int sum = 0;
        int count = number1;
        while (count <= number2) {
            if (isDivisible(count)) {
                sum = sum + count;
            }
            count++;
        }
        return sum;
    }

    private static boolean isDivisible(int number) {
        boolean div = false;
        if (number % 3 == 0) {
            div = true;
        }
        return div;
    }
}

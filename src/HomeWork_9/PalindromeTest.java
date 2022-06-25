package HomeWork_9;

public class PalindromeTest {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        String testText1 = "А роза упала на лапу Азора";
        printMessage("Test 1 is " + palindrome.isPalindrome(testText1));

        String testText2 = "LEvel";
        printMessage("Test 2 is " + palindrome.isPalindrome(testText2));

        String testText3 = "sum summus mus";
        printMessage("Test 3 is " + palindrome.isPalindrome(testText3));

        String testText4 = "sum summuuus mus";
        printMessage("Test 4 is " + !palindrome.isPalindrome(testText4));
    }

    private static void printMessage(String testText) {
        System.out.println(testText);
    }
}


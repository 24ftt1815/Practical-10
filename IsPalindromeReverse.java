import java.util.Scanner;

public class IsPalindromeReverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 900) + 100;
        System.out.print("Enter the reverse of " + number + ": ");
        String userInput = input.nextLine();

        while (userInput.length() != 3 || !userInput.matches("\\d{3}")) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userInput = input.nextLine();
        }

        int userReverse = Integer.parseInt(userInput);
        // int correctReverse = reverse(number);


        boolean result = isPalindrome(number, userReverse);
        System.out.println("\nThe digit " + userInput + " is palindrome of " + number + " is " + result + ".");
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number, int userReverse) {
        int correctReverse = reverse(number);
        return userReverse == correctReverse;
    }
}

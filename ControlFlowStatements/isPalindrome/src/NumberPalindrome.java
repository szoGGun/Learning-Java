public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10;
            reverse += lastDigit;

            if (reverse == number) {
                return true;
            }

            originalNumber /= 10;
            reverse *= 10;
        }
        return false;
    }
}

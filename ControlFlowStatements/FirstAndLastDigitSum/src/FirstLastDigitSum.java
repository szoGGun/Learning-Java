public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0; int firstDigit = 0; int lastDigit = 0;
        if (number >= 0) {
            lastDigit = number % 10;

            while (number > 0) {
                firstDigit = number % 10;
                number /= 10;
            }
            return sum = lastDigit + firstDigit;
        }
        return -1;
    }
}

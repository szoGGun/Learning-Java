public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int even = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            if (digit % 2 == 0) {
                even += digit;
            }
        }
        return even;
    }
}
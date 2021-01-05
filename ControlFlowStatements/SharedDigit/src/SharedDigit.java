public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        int result1, result2;
        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
            return false;
        }
        result1 = number1 % 10;
        number1 = number1 / 10;
        result2 = number2 % 10;
        number2 = number2 / 10;
        return (result1 == result2) || (number1 == number2) || (number1 == result2) || (number2 == result1);
    }
}
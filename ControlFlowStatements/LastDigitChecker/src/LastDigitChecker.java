public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        int result1;
        int result2;
        int result3;
        if ((number1 < 10 || number1 > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 1000)) {
            return false;
        }
        result1 = number1 % 10;
        result2 = number2 % 10;
        result3 = number3 % 10;
        return (result1 == result2 || result1 == result3 || result2 == result3);
    }

    public static boolean isValid(int number1) {
        return (number1 >= 10 && number1 <= 1000);
    }
}

//    public static boolean hasSharedDigit(int number1, int number2) {
//        int result1, result2;
//        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
//            return false;
//        }
//        result1 = number1 % 10;
//        number1 = number1 / 10;
//        result2 = number2 % 10;
//        number2 = number2 / 10;
//        return (result1 == result2) || (number1 == number2) || (number1 == result2) || (number2 == result1);
//    }
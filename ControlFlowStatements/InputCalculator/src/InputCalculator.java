import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        double avg = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                avg = ((double) sum / counter);
                System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}

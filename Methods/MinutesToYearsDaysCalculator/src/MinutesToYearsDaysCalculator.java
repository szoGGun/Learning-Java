public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int day = (int) (minutes / 1440) % 365;
            int years = (int) (minutes / 525600);
            System.out.println(minutes + " min = " + years + " y and " + day + " d");
        }
    }
}

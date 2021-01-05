package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double FirstVariable = 20.00;
        double SecondVariable = 80.00;
        double ResultVariable = (FirstVariable + SecondVariable) * 100.00;
        System.out.println("ResultVariable = " + ResultVariable);
        double Remainder = ResultVariable % 40.00;
        System.out.println("Remainder value = " + Remainder);
        if (Remainder == 0) {
            boolean Result = true;
            System.out.println("Remainder = " + Result);
        } else {
            boolean Result = false;
            System.out.println(Result);
            System.out.println("It got some remainder");
        }
    }
}

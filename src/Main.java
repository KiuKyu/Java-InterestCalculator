import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        System.out.print("Enter investment amount: ");
        money = userInput.nextDouble();

        System.out.print("Enter number of months: ");
        month = userInput.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = userInput.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);


    }
}

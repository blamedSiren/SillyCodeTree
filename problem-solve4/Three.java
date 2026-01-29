import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the hours you worked this week: ");
        double hoursWorked = input.nextDouble();
        System.out.println("Please enter your hourly pay rate: ");
        double payRate = input.nextDouble();

        if(hoursWorked >= 40){
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * payRate * 1.5;
            double regularPay = 40 * payRate;
            double totalPay = regularPay + overtimePay;
            System.out.printf("Your total pay including overtime is: $%.2f%n", totalPay);
        } else {
            double totalPay = hoursWorked * payRate;
            System.out.printf("Your total pay is: $%.2f%n", totalPay);
        }
        input.close();
    }
}

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);    
        Loan loan1=new Loan();
        
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double rate=input.nextFloat();
        loan1.setAnnualInterestRate(rate);
        
        System.out.print("Enter number of years as an integer: ");
        int years=input.nextInt();
        loan1.setNumberOfYears(years);
        
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmt=input.nextDouble();
        loan1.setLoanAmount(loanAmt);
        
        long millis=System.currentTimeMillis();
        java.util.Date date=new java.util.Date(millis);
        System.out.println("The loan was created on "+date);
        loan1.setLoanDate(date);

        System.out.println("The monthly payment is " + String.format("%.2f", loan1.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f", loan1.getTotalPayment()));
    }
}

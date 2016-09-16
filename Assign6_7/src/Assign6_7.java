
/**
 *
 * @author tp0719561
 */
import java.util.Scanner;

public class Assign6_7 
{
    public static double futureInvestmentValue( double investAmount, double monthlyInterestRate, int years)
    {
        double futureValue;
        
       futureValue = investAmount * monthlyInterestRate /years;
        
       System.out.println(futureValue);
       
       
       return futureValue;
       
       
    
    }

    public static void main(String[] args) 
    {
        Scanner ScannerObject = new Scanner(System.in);
        
        double numb;
     
        double InterestRate;
        
        int Years;
        
        System.out.println("Please enter the investment amount:");
        
        numb = ScannerObject.nextDouble();
        
        System.out.println("Please enter the monthly interst rate:");
        
        InterestRate = ScannerObject.nextDouble();
        
        System.out.println("Please enter the amount of years:");
        
        Years = ScannerObject.nextInt();
        
        System.out.println("The future value of the investment is: ");
        
        futureInvestmentValue(numb, InterestRate, Years);
        
       
        /*
        System.out.println(numb);
        
        System.out.println(InterestRate);
        
        System.out.println(Years);
        */
    }
    
}

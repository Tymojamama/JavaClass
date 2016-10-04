
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
       
       //System.out.println(investAmount + " " + monthlyInterestRate + " " + years);
       
       return futureValue;
       
       
    
    }

    public static void main(String[] args) 
    {
        Scanner scannerObject = new Scanner(System.in);
        
        double numb;
     
        double interestRate;
        
        int years;
        
        System.out.println("Please enter the investment amount:");
        
        numb = scannerObject.nextDouble();
        
        System.out.println("Please enter the monthly interst rate:");
        
        interestRate = scannerObject.nextDouble();
        
        System.out.println("Please enter the amount of years:");
        
        years = scannerObject.nextInt();
        
        System.out.println("The future value of the investment is: ");
        
        futureInvestmentValue(numb, interestRate, years);
        
       
        /*
        System.out.println(numb);
        
        System.out.println(InterestRate);
        
        System.out.println(Years);
        */
    }
    
}

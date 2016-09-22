/**
 *
 * @author tp0719561
 */
import java.util.Scanner;
        
public class Assign6_2 
{
    
    
    public static int sumDigits(long n)
    {
       // int digitsCalc=0;
    
        long m=0;
        
        long o=0;
        
       System.out.println("The sum of the digits for " +n+" is");
            //String IntCalc = Integer.toString(digitsCalc);
          
           // Long longCalc = Long.parseLong(IntCalc);
        
           
        while(n !=0)
        {
            
           m = n %10;
        
        
        // System.out.println(n +" "+ m + " "+ o);
         
            n = n/10;
        
            o = m + o;
        
        }
        
        
        System.out.println(o);
         
          // System.out.println(m );
           
           // System.out.println(n );
           int IntCalc = Math.round(o);
         
        
        
              
       // System.out.println( n + m);
       
        
          return IntCalc;     
        
         
        //long IntCalc = Long.parseLong(digitsCalc);
        
       // System.out.println(n);
    }

   
    public static void main(String[] args) 
    { 
        long digit;
       Scanner ScannerObject = new Scanner(System.in);
       
       System.out.print("Please enter a number of your choice: ");
       digit= ScannerObject.nextInt();
       
       sumDigits(digit);
       
       
       //System.out.println(digit);
       
      
    }
    
}

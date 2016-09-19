

/**
 *
 * @author tp0719561
 * 
 * 
 */
import java.util.Scanner;

public class Assign6_3 
{

    public static int reverse(int number)
    {
        int length=0;
        int palendromeTest = 0;
    
        String numb = Integer.toString(number);
        
        
        length= numb.length();
    
        for( int i = length - 1; i>=0; i-- )
        {
            palendromeTest = palendromeTest + numb.charAt(i);
         System.out.println(numb +" "+ number);
        }
        
        
        return palendromeTest;
    }
    public static boolean isPalendrome(int number)
    {
        boolean palendromeTestStatus = false;
        int length=0;
        
         int palendromeTest = 0;
    
         
        String numb = Integer.toString(number);
        
         System.out.println(numb +" "+ number);
      //int revNumb =0;
    
         length= numb.length();
         
         System.out.println(length);
        for( int i = length - 1; i>=0; i-- )
        {
            palendromeTest = palendromeTest + numb.charAt(i);
            
           System.out.println(numb +" "+ number);
        }
       
        if( Integer.parseInt(numb) != palendromeTest)
        {
        palendromeTestStatus = true;
        
        }
        else
        {
        palendromeTestStatus = false;
        }
    
        return palendromeTestStatus;
    }
    
   
    public static void main(String[] args) 
    {
        int numb;
        int revNumb;
        
        Scanner ScannerObject = new Scanner(System.in);
        
        System.out.println(" Please enter a possible palendrome: ");
        numb = ScannerObject.nextInt();
        
       // System.out.println(numb);
        
        reverse(numb);
        
        System.out.println(numb);
        
        revNumb = numb;
        
        boolean palendrome = isPalendrome(revNumb);
        
      if(palendrome == true)
      {
          
      System.out.println("The number "+ numb + " is a palendrome!");
      
      
      
      
      }
      else
      {
      System.out.println("The number "+numb+ " is not palendrome!");
      
      }  
        
    }
    
}

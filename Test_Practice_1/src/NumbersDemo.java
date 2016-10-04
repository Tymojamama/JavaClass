

/**
 *
 * @author tp0719561
 */
//imorting the Scanner class
import java.util.Scanner;
public class NumbersDemo 
{
    
    public static void main(String[] args) 
    
    {
        //initializing the ScannerObject
        Scanner ScannerObject = new Scanner(System.in);
       //initializing variables
        int input1;
       int input2;
       
       //int input1Plus;
      // int input2Plus;
      
      //prompt for the first input and reading in the data to the frist input
       System.out.println("Please input a number.");
       input1 = ScannerObject.nextInt();
       
       
      //prompt for the first input and reading in the data to the second input
       System.out.println("Please input a second number.");
       input2 = ScannerObject.nextInt();
       
       //debug print to show what was inputed
       System.out.println("The inputs were: "+ input1 + " "+ input2);
       
       //run both of the inputs and run the DisplayTwiceTheNumber method
       //for each.
        DisplayTwiceTheNumber(input1);
        DisplayTwiceTheNumber(input2);       
       
        //run both of the inputs and run the DisplayNumberPlusFive method
       //for each.
        DisplayNumberPlusFive(input1);
        DisplayNumberPlusFive(input2);
        
        //run both of the inputs and run the DisplayNumberSquared method
       //for each.
        DisplayNumberSquared(input1);
        DisplayNumberSquared(input2);
       //System.out.println(input1Plus);
       
       //*** Keep these commented out***
          //System.out.print("The second input added to itself is: ");
       //System.out.println(input2Plus);
       
       
    }
    
    //Displaying the number plus itself method
    public static int DisplayTwiceTheNumber(int number)
    {
        //initialzing variable
        int numberPlus;
        
        //outputting the first part of the output for the method
        //showing what the number is
   System.out.print("The number "+ number);
   
   //adding the number to itself
    number += number;
    
   // secondNumber += secondNumber;
    
   //setting the variable that is now the number plus the number
   numberPlus = number;
   
   //
   System.out.println(" added to itself is: "+ numberPlus);
           return numberPlus;
    }
    
    public static int DisplayNumberPlusFive(int number)
    {
    int numberPlusFive;
   System.out.print("The number "+ number);
    
    
    numberPlusFive = number + 5;
    
   System.out.println(" plus five, is: "+numberPlusFive);
        return numberPlusFive;
    }
    
    public static int DisplayNumberSquared(int  number)
    {
    int numberSquared;
   System.out.print("The number "+ number);
   
    
    //double numberDouble = Double.parseDouble(number);
    numberSquared = number * number;
    
    System.out.println(" squared, is  "+ numberSquared);
   
    return numberSquared;
    }
    
}

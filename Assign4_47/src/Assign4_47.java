/**
 *
 * @author tp0719561
 */

import java.util.Scanner;

public class Assign4_47 
{
   
    public static void main(String[] args) 
    {
        String isbn;
        
        Scanner ScannerObject = new Scanner(System.in);
        
        System.out.println("Enter the first 12-digit of an ISBN number as a string:");
        isbn = ScannerObject.nextLine();
        
        System.out.print("The ISBN number is "+ isbn);
    }
    
}

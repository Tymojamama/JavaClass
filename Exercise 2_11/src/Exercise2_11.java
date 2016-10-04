/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author tp0719561
 */
public class Exercise2_11
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int years=0;
        
        Scanner ScannerObject = new Scanner(System.in);
        
        int x = ScannerObject.nextLine();
         final int HoursPerYear= (24*365) * years;
          long MinuteesPerYear = HoursPerYear *60;
          long SecondsPerYear = HoursPerYear *60;
        
        
        long birth = SecondsPerYear /7;
        System.out.println(birth);
     
    }

}

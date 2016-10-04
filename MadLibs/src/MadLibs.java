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
public class MadLibs
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        String MadLibText;
        Scanner MadLibScanner = new Scanner(System.in);
        
        
        System.out.println("Please put a first word.");
        
        MadLibText= MadLibScanner.next();
        MadLibScanner.nextLine();
        
        System.out.println("This is "+ MadLibText);
        
        System.out.println("Please put a second word.");
        
        MadLibText= MadLibScanner.next();
        MadLibScanner.nextLine();
        
        
        System.out.println("This is not "+ MadLibText);
        
        System.out.println("Please put a third word.");
        
        
        MadLibText= MadLibScanner.next();
        MadLibScanner.nextLine();
        
        
        System.out.println("This sure is "+ MadLibText);
        
    }
    
}

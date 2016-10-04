/**
 *
 * @author tp0719561
 */
import java.util.Scanner;

public class RockPaperSissors 
{
    public static void main(String[] args) 
    {
        int userNumb;
        Scanner ScannerObject = new Scanner(System.in); 

        System.out.println("Please input a 0 For Rock, 1 for Paper, or 2 for sissors:");

        userNumb = ScannerObject.nextInt();
      
        int numb;
        
        numb = (int)(Math.random()*3);
        
        
        switch(userNumb)
        {
            case 0:
                if(userNumb == 1)
                {
        
                System.out.println("Computer Selected Paper,");
            
            
                }
                else if(userNumb == 0)
                {
                    System.out.println("Computer Selected Rock");
                    
                }
            
                else
                {            
                 System.out.println("Computer Selected Sissors");
            
                }
                break;
                
            case 1:
                
                if(userNumb == 1)
                {
        
                System.out.println("Computer Selected Paper,");
            
            
                }
                else if(userNumb == 0)
                {
                    System.out.println("Computer Selected Rock");
                    
                }
            
                else
                {            
                 System.out.println("Computer Selected Sissors");
            
                }
                break;
        }
                
                
        }
        
    }



/**
 *
 * @author Tyler Poag <tp0719561@otc.edu>
 */
import java.util.Scanner;
public class BookstoreCredit 
{

  
    public static void main(String[] args) 
    {
     Scanner ScannerObject = new Scanner(System.in);
     
     String studentName;
     Double GPA;
        System.out.println("Please enter your name: ");
        
        studentName = ScannerObject.nextLine();
        
        System.out.println("Please enter your GPA: ");
        
        GPA = ScannerObject.nextDouble();
        
        DisplayMessages(studentName, GPA);
    }
    
    
    public static void DisplayMessages(String Name, Double GradePointAverage)
    {
        //System.out.println("This is a test message");
        
        Double Credit;
        
        Credit = GradePointAverage * 10;
        
        System.out.println(" The student name is "+Name+"\n The GPA of the student is "+GradePointAverage+" \n The bookstore credit is $"+Credit);
        
        
        
    }
}

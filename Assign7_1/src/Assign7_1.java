//TO DO:
//COMPLETE THIS FOR CLASS
import java.util.Scanner;

public class Assign7_1 {

  
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int students;
        
        int best=0;
        
        System.out.println(" Enter the number of students:  ");
        
        students = input.nextInt();
        
        int grades[] = new int [students];
        
        
        
        int i;
        
      
        
       
            for(i=0; i < students; i++)
            {
            
             
                  System.out.println(" Enter the grades:  ");

            grades[i] = input.nextInt();
            
                  if( best < grades[i])
                {
                
                    best = grades[i];

                }
                 
            }
        while(i != 0)
        {
            
           if(grades[i] > best -10) 
           {
               System.out.println(grades[i] + "Grade: A");
                
               // grades[i] = input.nextInt();
              
           // i--;  
                
           }
           if (grades[i] > best -20) 
           {
               System.out.println("Grade: B");
               
              // grades[i] = input.nextInt();
               
               
               
          //  i--;
           }
           if (grades[i] > best -30) 
           {
               System.out.println("Grade: C");
               
              // grades[i] = input.nextInt();
               
                
               
          //  i--;
           }
           if (grades[i] > best -40) 
           {
           System.out.println("Grade: D");
           
          // grades[i] = input.nextInt();
           
           
             
          //  i--;
           }
           else
           {
           System.out.println("Grade: F");
           
           //grades[i] = input.nextInt();
           
            
           
           
          //  i--;
           }
           
        }
          

    }
       
        
        
       

               
       
        
        
}

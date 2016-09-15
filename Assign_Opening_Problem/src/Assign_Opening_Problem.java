

/**
 *
 * @author tp0719561
 */
public class Assign_Opening_Problem 
{

    public static int sum(int i1, int i2)
    {
    int sum = 0;
    for(int i = i1; i <=i2; i++)
        {
            sum +=1;
            
        }
    return sum;
    }
    
    
    public static void main(String[] args) 
    {
        
        int i=5;
        int j=2;
        int k = max (i,j);
      
        
       
   
           System.out.println("The max of the numbers is "+ k);
           
           
       
    }
    
    public static int max(int num1, int num2)
    {
    int result;
    
        if (num1>num2)
        {
        result = num1;
        }
        else
        {
            result=num2;
        }
        return result;
    }
    
}

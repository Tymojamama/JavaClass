package assign7_16;

import static java.util.Collections.list;

/*
  @author tp0719561
 */
public class Assign7_16 
{
    
    public static void main(String[] args) 
    {
        double[] numbers = new double[100000];
  
     int length;   
       
     int i;
     length = numbers.length;
        
     double randomNumb;
     
     
     for( i=0;i < length; i++)
        {
            randomNumb = Math.random();
     
            numbers[i] = randomNumb;
        
            System.out.println("The Number is: " + numbers[i]);
        
            
            linearSearch( numbers, i);
     
            System.out.println(" " +  );
        }
        
    }


        public static int linearSearch(double[] list, int key)
        {
        
            for(int i = 0; i < list.length; i++)
            {
            
                if(key == list[i])
                {
                return 1;
                }
                
            }
            return -1;
        }

    
    public static void DisplayLinearSort(double[] numbers)
    {
    
    
    
    }
}


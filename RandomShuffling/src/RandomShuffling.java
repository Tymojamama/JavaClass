

/**
 *
 * @author tp0719561
 */
public class RandomShuffling 
{

    //main methods
    public static void main(String[] args) 
    {
        //initial 53 memory locations in a double array
        double[] values = new double[53];
        
        
        //initial for statement with i set at the first card
        
        for(int i= 1; i < values.length ; i++)
        {
        
           
        }
       
    
        
        double temp = values[0];
        
        for(int i = 1; i < values.length; i++)
        {
        
             //the int j is the random number of the length of the array values
            int j = (int)(Math.random() * values.length);
            
            // temp value is the i value
            //double temp = values[i];
            //i value is not j value
            values[i] = values[j];
            //j value is now the temp value
            values[j] = temp;
        
            //output the original index and the random shuffled index for said card
            System.out.println("Original card number: "+ i +"\n Random shuffled card number: "+j);
            values [i -1] = values [i];
        
            System.out.println("J:"+j+" I:"+i+" Temp: "+temp);
        
        values[values.length - 1] = temp;    
        }
            
        
        
    }
    
}

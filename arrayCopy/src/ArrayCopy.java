

/**
 *
 * @author tp0719561
 */
public class ArrayCopy 
{


    public static void main(String[] args) 
    {
        int[] sourceArray = {1,2,3,4,5,6,7,8,9,10};
        
        int targetArray[] = new int [sourceArray.length];
        
        
     System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
     
     for(int e: targetArray)
     {
     System.out.println(e);
     }
     
    }
    
    
    
}


//import java.util.Date;



/**
 *
 * @author tymo
 */
public class Assign9_6 {

    
    public static void main(String[] args) 
    {
        Stopwatch stopWatch = new Stopwatch();
        
        stopWatch.start();
        
        double [] numb = new double[100000];
        
        for(int i =0; i < numb.length; i++)
        {
        numb[i] = Math.random() * numb.length;
            
        
        }
        
       numbSort(numb);
        
       // long timeAfter = stopWatch.getElapsedTime();
        
        stopWatch.stop();
        
        System.out.println(  "\n Timer Time: " + stopWatch.getElapsedTime() );
        
        
        
    }
    
   public static void numbSort(double numb[])
   {
   
   for(int i = 0; i < numb.length -1; i++)
        {
        
            double currentSmall = numb[i];      
            int currentSmallIndex = i;
            
            for(int j = i +1 ; j < numb.length; j++ )
            {
            
                if(currentSmall > numb[j])
                {
                
                    currentSmall = numb[j];
                    currentSmallIndex =j;
                }
            }
            if(currentSmallIndex != i)
            {
            numb[currentSmallIndex] = numb[i];
                
            numb[i] = currentSmall;
            }
            
        }
   
   }
}
    
   

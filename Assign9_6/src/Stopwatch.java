
//import java.text.DateFormat;
//import java.util.Date;
//import java.util.Calendar;
/**
 *
 * @author tymo
 */
public class Stopwatch 
{

    private long startTime = System.currentTimeMillis();
    private long endTime =startTime;
    
    Stopwatch()
    {
     
        
    }
public void start()
{
    long startTime = System.currentTimeMillis();
    
    //return startTime;
    
    
}
public void stop()
{
//long endTime = ();
   
    //return endTime;
long endTime = System.currentTimeMillis();
}

public long getElapsedTime()
{

   // long elapsedTime;
         
    return startTime - endTime;
}

    
}

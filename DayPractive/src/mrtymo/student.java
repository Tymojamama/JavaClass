package mrtymo;

/**
 *
 * @author tp0719561
 */
public class student 
{

   public String fName;
   public void printName()
   {
       
       System.out.println(fName);
       
   }
   static double percentageScore;
    static int totalScores;
    static int cntstudents;
    
    public double getTestPercentage(double totScore, double possPoints)
    {
    
    totalScores+= totScore;
    
percentageScore = totalScores / possPoints;

    System.out.println ();
    
    return percentageScore;
    }
}

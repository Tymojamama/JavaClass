
package mrtymo;

/*
  @author tp0719561
 */
public class DayPractive 
{

   
    public static void main(String[] args) 
    {
       student student1 = new student();
       
       student1.fName = "Tyler";
       student student2 = new student();
       student2.fName = "Steve";
       student1.printName();
      student2.printName(); 
      
      System.out.println(student1.getTestPercentage(95, 100));
      System.out.println(student1.getTestPercentage(35, 100));


      double avgGrade;
      avgGrade= student.totalScores / student.possPoints;    
      
    }
    
}

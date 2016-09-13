

/*
    Tyler Poag
    Java
    CIS 170
    @author tp0719561
 */
import java.util.Scanner;
 
public class Strings 
{   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String animal = "rhino";
      System.out.println(animal.length());
      
      String animal2 = "hippo";
      String string3 = animal.concat(animal2);
      System.out.println(string3);
      
      System.out.println(string3.toUpperCase());
      
      char ch= string3.charAt(0);
      System.out.println(ch);
      
      System.out.println("Enter 2 words: ");
      String comp1 = input.next();
      String comp2 = input.next();
      
      if(comp1.equals(comp2))
      {
          System.out.println("yes");
          
      }
      else
      {
          System.out.println("no");
      }
      
      String s ="Kim Jones";
      int k = s.indexOf(' ');
      System.out.println(k);
    }
    
}

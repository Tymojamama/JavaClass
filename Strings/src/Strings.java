

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
      
      String firstName = s.substring(0,k);
      String lastName = s.substring(k+1);
      System.out.printf("%s%s", lastName, firstName);
      
      String string4="6";
      System.out.println(string4+ 6);
      
      int intValue = Integer.parseInt(string4);
      System.out.println(intValue + 6);
      
      double dblValue= Double.parseDouble(string4);
      System.out.println(dblValue +6);
              
      int intNum = 6;
      String strValue = intNum + "dogs";
      System.out.println(strValue);
      
      System.out.println("Enter a sentance press enter: ");
      
      String s1 = input.nextLine();
      
      System.out.println("Then two words separated by spaces: ");
      
      String s2 = input.next();
      String s3 = input.next();
      
      System.out.println("s1 is "+ s1);
      
      System.out.println("s2 is "+ s2);
      
      System.out.println("s3 is "+ s3);
      
      Scanner stdin = new Scanner(s1);
      while(stdin.hasNext())
      {
          System.out.println(stdin.next());
      }
    }
    
    
}

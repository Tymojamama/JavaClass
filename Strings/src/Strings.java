

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
        String animal = "rhino";
      System.out.println(animal.length());
      
      String animal2 = "hippo";
      String string3 = animal.concat(animal2);
      System.out.println(string3);
      
      System.out.println(string3.toUpperCase());
    }
    
}

import javax.swing.*;

/**
 *
 * @author tp0719561
 */
public class JavaXHomework 
{

    
    
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder();
        String id = "";
        
        String name = JOptionPane.showInputDialog(null,
                "Enter your full name- first, middle, last");

        JOptionPane.showMessageDialog(null, "Name is: " + name);
        
         String streetAddress = JOptionPane.showInputDialog(null,
                "Enter your street address: ");

        JOptionPane.showMessageDialog(null, "StreetAddress is: " + streetAddress);
      
        int index;
      str.append( name.charAt(0));
      
      index = (name.indexOf( ' ' )+1);
      str.append(name.charAt(index));
     
      /*
      index = (name.indexOf( ' ' )+1);
      str.append(name.charAt(index));
    
       index = (streetAddress.indexOf( ' ' )+1);
       
      str.append(streetAddress.charAt(index));
    
      */
        for(index = 0; index < 4; index++)
     {
     
      str.append(streetAddress.charAt(index));
      
     }
        System.out.println("Your ID is: " + str);
        
        
        
    }
    
}

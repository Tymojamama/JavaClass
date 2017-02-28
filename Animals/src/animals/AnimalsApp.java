package animals;

import javax.swing.*;
/**
 *
 * @author tymo
 */
public class AnimalsApp 
{

   // Animal AnimalClass = new Animal();

   
    public static void main(String[] args)
    {
        
    String choice;
      
    Animal AnimalClass = new Animal();
    
    
   Fish FishClass = new Fish();

    String AnimalMainString;
    
    
    String name;
      
      choice = JOptionPane.showInputDialog(null
        , " Please enter the animal type: \n 1 for Fish \n 2 for Horse \n 3 for Bird:");
      
      name = JOptionPane.showInputDialog(null
                , " Please enter the animal name:");
      
      
      
       int intChoice = Integer.parseInt(choice);
               
       if(intChoice == 1)
       {
       
           
       
       }
        
         
         
      
       AnimalMainString = AnimalClass.toString();
       
       
        
       System.out.println(AnimalMainString);
    }
    
}

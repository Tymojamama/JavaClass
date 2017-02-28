package animals;

/**
 *
 * @author tymo
 */
public class Animal 
{
     
    public String name;
   
    
    Animal() 
    {
        
    }
    
   public Animal (String animalName)
    {
        
        animalName = name;
    
    }

    
        
    public String getMovement()    
    {
    
       
        
        return "Moves";        
    
    }
    @Override
    public String toString()
    {
        return name + " is an animal and it " + getMovement();
    }
}

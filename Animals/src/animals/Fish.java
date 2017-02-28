package animals;


/**
 *
 * @author tymo
 */
public class Fish extends Animal
{
        
    public Fish (String animalName)
    {
        super(animalName);
    }

    Fish() 
   {
       
       
       
   }

 
    @Override
  public String getMovement()    
    {
    
       
        
        return "Swims";        
    
    }
    
    @Override
     public String toString()
    {
        return name + " is an animal and it " + getMovement();
    }
    
    
}

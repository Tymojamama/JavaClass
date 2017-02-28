package animals;

/**
 *
 * @author tymo
 */
public class Horse extends Animal
{
    
           Horse() 
   {
       
       
       
   }
    
    public Horse(String animalName)
    {
        super(animalName);
    }
    

    
    @Override
  public String getMovement()    
    {
    
       
        
        return "Gallops";        
    
    }
    
    @Override
     public String toString()
    {
        return name + " is an animal and it " + getMovement();
    }
    
    
}

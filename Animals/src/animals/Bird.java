package animals;

/**
 *
 * @author tymo
 */
public class Bird extends Animal
{
            Bird() 
   {
       
       
       
   }
    
    
    public Bird (String animalName)
    {
        super(animalName);
    }
    
    
      @Override
  public String getMovement()    
    {
    
       
        
        return "Flies";        
    
    }
    
    @Override
     public String toString()
    {
        return name + " is an animal and it " + getMovement();
    }
    
}

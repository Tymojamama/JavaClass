
/**
 *
 * @author tp0719561
 */
public class WhileLoop 
{

    public static void main(String[] args) 
    {
     int count;
     int Kilo = 1;
     double Pound = 2.2;
        for ( count=0; count < 20; count++)
        { 
            System.out.printf("Kilograms: %d  Pounds: %f \n", Kilo,Pound);
            
    
        Kilo++;
        Pound = Pound + 2.2;
        }
        
    }
    
}

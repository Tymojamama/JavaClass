/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tymo
 */
public class EulerProjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int attempt =0;
        int numb = 10;
        //System.out.println("The numbers btween 10 and 0 are:" );
        while(numb > 0)
        {
            
            attempt = numb /3;
            
            
            numb = numb -1;
            if(attempt != Math.round(attempt))
            {
            System.out.println(numb+" is a multiple of 3 or 5");
            
            }
            else
                {
                
                     
                }
            
            
            
        }
    }
    
}

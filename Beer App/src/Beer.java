/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tymo
 */

public class Beer {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    int Beer =99;
    
        while (Beer > 1)
           {
               
               System.out.println(Beer + " bottles of beer on the wall, take one down, pass it around," );
        
               Beer = Beer -1;
               
               System.out.print(Beer + " bottles of beer on the wall, ");
           }
        if (Beer == 1)
        {
        System.out.println("There is only "+ Beer +" bottle of beer on the wall, take one down, pass it around,");
        }
        Beer = Beer -1;
        
        if (Beer == 0)
        {
        System.out.println("That was all the beer!");
        }
    }
}

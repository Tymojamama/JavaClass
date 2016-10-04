/*
*Slot Machine Program Java
*CIS 170
*9/6/16
*Markley
 */

/*
 * @author tp0719561
 */
//the Public class that the mahine is located in
public class SlotMachine
{

    //the main method that the program relies on
    public static void main(String[] args)
    {
        //initializing variable
        int numb1;
        int numb2;
        int numb3;


        //running a random number between 0 and 2 for the 3 variables
       numb1 = (int)(Math.random()*3);

       numb2 = (int)(Math.random()*3);

       numb3 = (int)(Math.random()*3);

       //if the cherries line up
        if(numb1 == 2 && numb2 == 2 && numb3 == 2)
        {
            //You win with the matched cherries
            System.out.println("You win with Cherry!");
        }//end if Cherry.

        //if the BARs line up
        if(numb1 == 1&& numb2== 1 && numb3 == 1)
        {
            //you win with BARs
            System.out.println("You win with BAR!");
        }//end if BAR
        //if all the Pumpkins line up
        if(numb1 == 0 && numb2 == 0 && numb3 == 0)
        {
            //You win with Pumpkins
            System.out.println("You Win With Pumpkin!");

        }//end if Pumpkins

        //Shows the rolls on the machine!
        System.out.println("You Rolled:"+ numb1+" "+ numb2+" "+ numb3);
    }//end main method

}//end class

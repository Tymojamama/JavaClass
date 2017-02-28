/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign9_1;

/**
 *
 * @author tymo
 */
public class Polygons 
{
    
   // public static double Width;
    //public static double Hight;
    //public static double Area;
    //public static double perimeter;
    
    
   public double getArea(double width, double Height)
    {
        double Area = 1 + (width * Height);
        
        return Area;
    }
   public double getperimeter(double Width, double Height)
    {
    double perimeter = 2 * (Width * Height);
        
    return perimeter;
    }
    
}

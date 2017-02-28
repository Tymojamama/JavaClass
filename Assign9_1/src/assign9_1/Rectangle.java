
package assign9_1;

/**
 *
 * @author tymo
 */
public class Rectangle 
{

       public static Polygons defaultVersion = new Polygons();
       public static Polygons integerVersion = new Polygons();
       public static Polygons doubleVersion = new Polygons();
        
    
    public static void main(String[] args) 
    {
    double AreaDefault = defaultVersion.getArea(1, 1);
    double PerimeterDefault = defaultVersion.getperimeter(1, 1);
        
        System.out.println("The default area is: " + AreaDefault + "|| \n The default perimeter is: " + PerimeterDefault);
        
        
        double AreaInt = integerVersion.getArea(4, 40);
    double PerimeterInt = integerVersion.getperimeter(4, 40);
        
    Math.round(AreaInt);
    Math.round(PerimeterInt);
    
        System.out.println("The default area is: " + AreaInt + "|| \n The default perimeter is: " + PerimeterInt);
        
    
        double AreaDouble = doubleVersion.getArea(3.5, 35);
    double PerimeterDouble = doubleVersion.getperimeter(3.5, 35.9);
        
    //Math.round(AreaInt);
    //Math.round(PerimeterInt);
    
        System.out.println("The default area is: " + AreaDouble + "|| \n The default perimeter is: " + PerimeterDouble);
        
        
    }
    
}

import java.util.Scanner;

public class Radius
{
  public static void main(String[] args)
  {
  final double PI = 3.1459;
  double area = 0;
  double radius = 0;

Scanner varInput = new Scanner(System.in)
System.out.print("Enter in a number for a radius: ");
radius = varInput.nextdouble();
area = radius * radius * PI
System.out.println("The area of the circle is" + area)

  }
}

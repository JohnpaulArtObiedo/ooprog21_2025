// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;

public class DebugFour1
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int radius;
      // Instantiation and assignment should use DebugCircle(radius) constructor
      DebugCircle c; // Declare the variable
      
      System.out.print("Enter a radius for a circle >> ");
      radius = input.nextInt();
      
      // Instantiate the DebugCircle object with the user-entered radius
      c = new DebugCircle(radius); 
      
      // Use the correct getter method names
      System.out.println("The radius is " + c.getRadius());
      System.out.println("The diameter is " + c.getDiameter());
      System.out.println("The area is " + c.getArea());
   }
}
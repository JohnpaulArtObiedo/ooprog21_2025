// This class uses a DebugPen class
// to instantiate two Pen objects
// One with default values
// and the other with user-supplied values

import java.util.Scanner;

public class DebugFour2
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      String color;
      String point;
      DebugPen pen1;
      DebugPen pen2;

      System.out.print("Enter a color ink for the pen >> ");
      color = input.nextLine();

      System.out.print("Enter a point size - fine, medium, or thick >> ");
      point = input.nextLine();

      // Instantiate a DebugPen object with default values
      pen1 = new DebugPen();

      // Instantiate a DebugPen object with user-supplied values
      pen2 = new DebugPen(point, color);

      System.out.println("Default value pen:");
      display(pen1);

      System.out.println("User value pen:");
      // FIXED: Used 'pen2' instead of 'pen22'
      display(pen2);
   }

   // FIXED: Changed parameter type from 'FixDebugPen' to 'DebugPen'
   public static void display(DebugPen p)
   {
      System.out.println("The pen has ink color " + p.getColor());
      // FIXED: Used parameter 'p' instead of 'p1'
      System.out.println("and a " + p.getPoint() + " point.");
   }
}

// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;
public class DebugFive4
{
   public static void main (String args[])
   {
      int one, two, three, four;
      int highest;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      one = input.nextInt();
      System.out.print("Enter an integer >> ");
      two = input.nextInt();
      System.out.print("Enter an integer >> ");
      three = input.nextInt();
      System.out.print("Enter an integer >> ");
      four = input.nextInt();
      
      /*highest = one;
      
      if(two > highest){
         highest = two;
      }
      if (three > highest){
         highest = three;
      } 
      if(four > highest){
         highest = four;
      }
      
      System.out.println("the highest number is "+highest);
      
*/      
      
       if(one > two && one > three && one > four)
       {
       highest = one;
       System.out.println("The highest number is " + highest);
       } else{
          if(two > one && two > three && two > four)
          {
          highest = two;
          System.out.println("The highest number is " + highest);
          } else{
             if(three == one && three > two && three > four){
             highest = three;
             System.out.println("The highest number is " + highest);
             } else{
                if(four > one && four > two && four > three){
                  highest = four;
                  System.out.println("The highest number is " + highest);
                  }
                }
             }
          }
   }
}

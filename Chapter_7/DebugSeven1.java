// Makes String comparisons
import java.util.*;
public class DebugSeven1
   {
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      String name1, name2, name3;
      
      System.out.println("Enter three names.");
      System.out.println("They can be the same or different.");
      
      System.out.print("First name >> ");
      name1 = kb.nextLine();
      System.out.print("Second name >> ");
      name2 = kb.nextLine();
      System.out.print("Third name >> ");
      name3 = kb.nextLine();
          
      comparNames(name1, name2, name3);
      }
   
   public static void comparNames(String name1, String name2, String name3)
      {
         System.out.print(name1 + " and " + name2);
         if(name1.equals(name2)){
         System.out.println(" are the same");
         }
         else{
         System.out.println(" are different");
         }
         System.out.print(name2 + " and " + name3);
         
         if(name2.equals(name3)){
         System.out.println(" are the same");
         }
         else{
         System.out.println(" are different");
         }
         
         System.out.print(name1 + " and " + name3);
         if(name1.equals(name3)){
         System.out.println(" are the same");
         }
         else{
         System.out.println(" are different");
         }
   }
}

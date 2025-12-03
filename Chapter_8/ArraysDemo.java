import java.util.*;

class ArraysDemo{
   
   public static void display(String message, int arrays[]){
      System.out.println("\n"+message);
      for (int i = 0; i < arrays.length; i++){
         System.out.print(arrays[i]);
      }
   }
   
   public static void main(String[] args){
      int[] arrays = {0, 0, 0, 0, 0,};
      
      display("Original array: ", arrays);
      
      Arrays.fill(arrays, 8);
      display("After filling with 8s: ", arrays);
      
      arrays[2] = 7;
      arrays[4] = 2;
      display("After changing two values: ", arrays);
      
      Arrays.sort(arrays);
      display("After sorting: ", arrays);
   }
}
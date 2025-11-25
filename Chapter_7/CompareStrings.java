import java.util.Scanner;

class CompareStrings{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      System.out.println("Hello World");
      String name = in.nextLine();
      
      name.compareTo(name);
      
      if(name.compareTo("Carmen") == 0){
         System.out.println("Carmen equals Carmen");
      } else {
         System.out.println("Carmen does not equal "+ name);
      }
      
      
   }
}
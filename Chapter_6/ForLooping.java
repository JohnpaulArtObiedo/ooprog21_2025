import java.util.Scanner;
class ForLooping{
   public static void main(String[] arg){
      Scanner in = new Scanner(System.in);
      
      double input = 0.0;
      int year1 = 1;
      int year2 = 1;
      int year3 = 1;
      int year4 = 1;
      double interest1 = 0.02;
      double interest2 = 0.03;
      double interest3 = 0.04;
      double interest4 = 0.05;
      
      System.out.println("Enter initial bank balance > ");
      input = in.nextInt();
      
      
      System.out.println("With an initial balance of $"+input+" at an interest rate of 0.02");
      double comp = input * interest1;
      double result = comp + input;
      
      for(int i = 0; i <= 3; i++){
         System.out.println("After the year "+year1+" balance is $"+result);
         
         result = result + (input * interest1);
         interest1 =+ 0.02;
         year1++;
      }
  
  
      System.out.println("\nWith an initial balance of $"+input+" at an interest rate of 0.03");
      double comp2 = input * interest2;
      double result2 = comp2 + input;
      
      for(int i = 0; i <= 3; i++){
         System.out.println("After the year "+year2+" balance is $"+result2);
         
         result2 = result2 + (input * interest2);
         interest2 =+ 0.03;
         year2++;
      }
      
      
      System.out.println("\nWith an initial balance of $"+input+" at an interest rate of 0.04");
      double comp3 = input * interest3;
      double result3 = comp3 + input;
      
      for(int i = 0; i <= 3; i++){
         System.out.println("After the year "+year3+" balance is $"+result3);
         
         result3 = result3 + (input * interest3);
         interest3 =+ 0.04;
         year3++;
      }
      
      
      System.out.println("\nWith an initial balance of $"+input+" at an interest rate of 0.05");
      double comp4 = input * interest4;
      double result4 = comp4 + input;
      
      for(int i = 0; i <= 3; i++){
         System.out.println("After the year "+year4+" balance is $"+result4);
         
         result4 = result4 + (input * interest4);
         interest4 =+ 0.05;
         year4++;
      }
  
  
  
  
   }
}
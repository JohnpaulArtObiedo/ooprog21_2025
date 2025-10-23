import java.util.Scanner;

class DoWhileLoop{
   public static void main(String[] arg){
      Scanner in = new Scanner(System.in);
      double input;
      double balance = 0.0;
      int year = 1;
      double interest = 0.03;
      double comp = 0.0;
      double result = 0.0;
      
      System.out.println("Enter the balance amount: ");
      balance = in.nextInt();
      
      do{
         System.out.println("Do you want to see the balance at the end of another year?");
         System.out.println("Enter 1 for YES\n   or any other number for NO >> \n");
         input = in.nextInt();
         
         if(input == 1){
            comp = balance * interest;
            result = balance + comp;
         } else{
            break;
         }
         
         System.out.println("After year " +year+ " at 0.03 interest rate, balance is $" +result+"\n");
         
         year++;
         interest *= 2.0;
         
      } while(true);
   }
}
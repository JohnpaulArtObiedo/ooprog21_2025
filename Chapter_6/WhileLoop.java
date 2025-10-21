import java.util.Scanner;
class WhileLoop{   
   public static void main(String[] args){
      int hello = 0;
      double interest = 0.03;
      double bank_result = 0.0;
      int loop =0;
      double bank2 = 0.0;
      
      Scanner in = new Scanner(System.in);
      System.out.println("Enter initial bank balance > ");
      int bank = in.nextInt();
      
      while(loop  <= 99){
         System.out.println("Do you want to see next year's balance?\nEnter 1 for YES or any NUMBER to NO >> ");
         int hi = in.nextInt();
         
         if(hi == 1){
            bank_result = bank * interest;
            bank2 = bank + bank_result;
            bank_result = bank_result * 2;
            loop++;
         } else {
            System.out.println("Exit");
            break;
         }
         System.out.println("After year 1 at 0.03 interest rate, balance is "+bank2);
      }
   }
}
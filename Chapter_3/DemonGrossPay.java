import java.util.Scanner;
class DemonGrossPay{

   public static double calculate = 22.75;
   public static double hour = 0;
   
   public static void main(String[] arg){
   
      Scanner in = new Scanner(System.in);
      System.out.print("Input the hours of work: ");
      hour = in.nextInt();
      
      calculateGross();
   }
   
   public static void calculateGross(){
      double result = hour * calculate;
      System.out.println(""+hour+" hours at $22.75 per hour is "+result+"");
   }
   
}
import java.util.Scanner;

class Payroll{
   public static void main(String[] arg){
      int hours;
      double pay_rate;
      
      Scanner input = new Scanner(System.in);
      
      
      System.out.println("How many hours did you work this week? ");
      hours = input.nextInt();
      System.out.println("What is your regular pay rate? ");
      pay_rate = input.nextDouble();
      
      Employee obj = new Employee(0, 0.0);
      obj.Calculate(hours, pay_rate, 9999, 60.00, 1.5);
      System.out.println("Regular pay is "+obj.cal);
      System.out.println("Overtime pay is "+obj.overtime);
      
   }
}
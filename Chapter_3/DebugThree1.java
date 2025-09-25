// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;

class DebugThree1 {
    public static void main(String args[]) {
        double check1;
        double check2;
              
        DebugThree1 obj = new DebugThree1();   
              
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextInt();
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextInt();
        
        obj.calcTip(check1, check2);             
    }

    public static double calcTip(double check1, double check2) {
        final double RATE = 0.15;
        double tip;
        double bill = check1 + check2;
        tip = bill * RATE;
        System.out.println("The tip should be at least $" + tip);
        return bill;
    }
}
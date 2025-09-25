// This application displays some math facts
import java.util.Scanner;

public class DebugThree2 {
    public static void main(String args[]) {
        int a, b, c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer >> ");
        a = input.nextInt();
        System.out.print("Enter a second integer >> ");
        b = input.nextInt();
        System.out.print("Enter a third integer >> ");
        c = input.nextInt();
        
        int add1 = a + b;
        int add2 = b + c;
        int add3 = a + c;
        
        int sub1 = a - b;
        int sub2 = b - c;
        int sub3 = a - c;
        
        add(a, b, c, add1, add2, add3);
        subtract(a, b, c, sub1, sub2, sub3);

    }

    public static void add(int a, int b,int c, int add1, int add2, int add3) 
    {
        System.out.println("The sum of " + a +
                " and " + b + " is " + add1 +".");
        System.out.println("The sum of " + b +
                " and " + c + " is " + add2 +".");
        System.out.println("The sum of " + a +
                " and " + c + " is " + add3 +".");
    }

    public static void subtract(int a, int b, int c, int sub1, int sub2, int sub3)
    {
       System.out.println("The difference between " +
       a + " and "+ b +" is "+ sub1);
       System.out.println("The difference between " +
       b + " and "+ c +" is "+ sub2);
       System.out.println("The difference between " +
       a + " and "+ c +" is "+ sub3);
    }
}
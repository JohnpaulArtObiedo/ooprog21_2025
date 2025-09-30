// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;

public class DebugFour3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        // All dimensions are typically integers for a box, so 'l' is an int
        int w, l, h;

        System.out.print("Enter width of box >> ");
        // FIXED: Changed nextInteger() to nextInt()
        w = input.nextInt(); 

        System.out.print("Enter length of box >> ");
        // FIXED: Changed nextDouble() to nextInt() to match 'l' declaration
        l = input.nextInt(); 
        
        System.out.print("Enter height of box >> ");
        h = input.nextInt();

        // FIXED: Changed FixDebugBox to DebugBox
        DebugBox box1 = new DebugBox(); 
        
        // FIXED: Changed 'box1' to 'box2' and FixDebugBox to DebugBox, passing user input
        DebugBox box2 = new DebugBox(w, l, h); 

        System.out.println("The dimensions of the first box are");
        box1.showData();
        System.out.print("The volume of the first box is ");
        // Correct way to call the helper method for box1
        showVolume(box1); 

        System.out.println("The dimensions of the second box are");
        box2.showData();
        System.out.print("The volume of the second box is ");
        // FIXED: Changed box2.showVolume() to the static showVolume(box2) call
        showVolume(box2);
    }

    // This method is correctly defined and calculates/displays the volume
    public static void showVolume(DebugBox aBox)
    {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }
}
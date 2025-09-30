// This class uses a DebugTrip class
// to instantiate three Trip objects
// Each uses a different version of the constructor
import java.util.Scanner;

public class DebugFour4
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String destinationCity;
        String departureCity;
        String mode;
        
        DebugTrip trip1;
        DebugTrip trip2;
        // FIXED: Changed second 'DebugTrip trip2;' to 'DebugTrip trip3;'
        DebugTrip trip3; 

        System.out.print("Enter destination city >> ");
        destinationCity = input.nextLine();

        System.out.print("Enter departure city >> ");
        departureCity = input.nextLine();

        System.out.print("Enter mode of transportation >> ");
        mode = input.nextLine();

        // Object 1: Uses one-argument constructor
        trip1 = new DebugTrip(destinationCity);
        
        // Object 2: Uses two-argument constructor
        trip2 = new DebugTrip(destinationCity, departureCity);
        
        // Object 3: Uses three-argument constructor
        trip3 = new DebugTrip(destinationCity, departureCity, mode);

        display(trip1);
        display(trip2);
        display(trip3);
    }

    public static void display(DebugTrip trip)
    {
        System.out.println("Going to " + trip.getDestination());
        // FIXED: Changed 'trp' to 'trip'
        System.out.println("Leaving from " + trip.getDepartureCity());
        System.out.println("Going by " + trip.getMode());
    }
}
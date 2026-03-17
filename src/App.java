/**
*
* ABSTRACT CLASS Room
*
*
* Use Case 2: Basic Room Types & Static Availability
*
* Description:
* This abstract class represents a generic hotel room.
*
* It models attributes that are intrinsic to a room type * and remain constant regardless of availability.
*
* Inventory-related concerns are intentionally excluded.
*
* @version 2.1
*/

// ABSTRACT CLASS ROOM
abstract class Room {

    // Attributes
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    // Constructor
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Number of Beds: " + numberOfBeds);
        System.out.println("Room Size: " + squareFeet + " sq ft");
        System.out.println("Price per Night: " + pricePerNight);
    }
}


// CLASS SingleRoom
/**
 * Represents a single room in the hotel.
 * @version 2.1
 */
class SingleRoom extends Room {

    /**
     * Initializes a SingleRoom with predefined attributes.
     */
    public SingleRoom() {
        super(1, 256, 1588.8);
    }
}

class DoubleRoom extends Room {

    /**
     * Initializes a DoubleRoom with predefined attributes.
     */
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

class SuiteRoom extends Room {

    /**
     * Initializes a SuiteRoom with predefined attributes.
     */
    public SuiteRoom() {
        super(3, 600, 5000.0);
    }
}



// MAIN CLASS (for testing)
public class App {
    public static void main(String[] args) {

        // Create SingleRoom object
        SingleRoom room = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suiteRoom = new SuiteRoom();

        // Display details
        room.displayRoomDetails();
        doubleRoom.displayRoomDetails();
        suiteRoom.displayRoomDetails();
    }
}
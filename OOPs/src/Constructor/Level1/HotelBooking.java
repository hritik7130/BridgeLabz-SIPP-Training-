package Constructor.Level1;

public class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    
    public void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }

        public static void main(String[] args) {
     
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayBooking();

        System.out.println();

       
        HotelBooking booking2 = new HotelBooking("Riya Sharma", "Deluxe", 3);
        System.out.println("Custom Booking:");
        booking2.displayBooking();

        System.out.println();

  
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copied Booking:");
        booking3.displayBooking();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity_Cisneros;

/**
 *
 * @author User
 */
public class Room {

    protected int roomNumber;
    protected String roomType;
    protected String guestName;
    protected int numberOfNights;

    public Room(int roomNumber, String roomType, String guestName, int numberOfNights) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    }

    public double calculateBookingCost() {
        return 0.00;
    }

    public void displayBooking() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest: " + guestName);
        System.out.println("Nights: " + numberOfNights);
        System.out.printf("Booking Cost: $%,.2f%n", calculateBookingCost());
        System.out.println();
    }
}

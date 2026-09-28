/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity_Cisneros;

/**
 *
 * @author User
 */
public class DeluxeRoom extends Room {

    public DeluxeRoom(int roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Deluxe", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return (2500.00 + 300.00) * numberOfNights;
    }
}

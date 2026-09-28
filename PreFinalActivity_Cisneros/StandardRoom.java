/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity_Cisneros;

/**
 *
 * @author User
 */
public class StandardRoom extends Room {

    public StandardRoom(int roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Standard", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return 1500.00 * numberOfNights;
    }
}

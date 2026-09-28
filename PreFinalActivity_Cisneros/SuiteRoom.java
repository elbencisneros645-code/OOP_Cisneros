/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity_Cisneros;

/**
 *
 * @author User
 */
public class SuiteRoom extends Room {

    public SuiteRoom(int roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Suite", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return (4000.00 * numberOfNights) + 1000.00;
    }
}
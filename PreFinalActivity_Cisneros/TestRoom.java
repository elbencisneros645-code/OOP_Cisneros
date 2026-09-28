/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity_Cisneros;

/**
 *
 * @author User
 */
public class TestRoom {
    
    public static void main(String[] args) {
        Room[] rooms = {
            new StandardRoom(101, "Pedro Cruz", 3),
            new DeluxeRoom(202, "Ana Reyes", 2),
            new SuiteRoom(301, "Carlo Santos", 2)
        };

        System.out.println("===== HOTEL BOOKING =====");
        System.out.println();

        for (Room room : rooms) {
            room.displayBooking();
        }
    }
    
}

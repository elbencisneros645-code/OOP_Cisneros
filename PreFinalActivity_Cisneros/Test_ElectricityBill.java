/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity_Cisneros;

/**
 *
 * @author User
 */
public class Test_ElectricityBill {

    public static void main(String[] args) {

        ElectricityBill bill1 = new ElectricityBill(
                "EL-1001",
                "Juan Santos",
                "Residential",
                1250,
                1475
        );

        bill1.displayBill();
    }
}

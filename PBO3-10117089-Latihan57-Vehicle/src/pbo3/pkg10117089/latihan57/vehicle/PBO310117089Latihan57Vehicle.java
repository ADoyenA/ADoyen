/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan57.vehicle;

/**
 *
 * @author a
 */
public class PBO310117089Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicycle bcy1 = new Bicycle();
        bcy1.setMyGearCount(23);
        System.out.println("Jumlah Gear : " + bcy1.getMyGearCount()+"\n");
        
        Skateboard sb1 = new Skateboard();
        sb1.setMyBoardLength(54.5);
        System.out.println("Panjangnya Board : " + sb1.getMyBoardLength());
    }
    
}

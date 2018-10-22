/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan49.biayaemaskawin;

/**
 *
 * @author a
 */
public class PBO310117089Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Emas emas = new Emas();
        
        emas.setTotalBerat(15.7);
        emas.setHarga(570000);
        
        System.out.println("Total Berat Emas : " + emas.getTotalBerat() + " gram");
        System.out.println("Harga 1 gram Emas : Rp. " + emas.getHarga());
        System.out.println("Total Harga yang harus dibayar : " 
                + emas.totalHarga(emas.getTotalBerat(), emas.getHarga()));
    }
    
}

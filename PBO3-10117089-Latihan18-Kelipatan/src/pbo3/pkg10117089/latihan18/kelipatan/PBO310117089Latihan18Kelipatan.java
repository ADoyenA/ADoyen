/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan18.kelipatan;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * kelipatan angka 3,5 sampai 35
 */
public class PBO310117089Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double bilangan;
        
        bilangan = 3.5;
       
        while (bilangan<=35) {
            if (bilangan != 0){
                System.out.println(bilangan);
            }
            bilangan+=3.5;
        }
        System.out.println("Developed by : Shendi Permana");
        System.out.println("===========A.Doyen===========");
    }
    
}

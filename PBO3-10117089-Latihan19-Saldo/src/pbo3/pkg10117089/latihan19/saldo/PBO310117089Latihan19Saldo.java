/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan19.saldo;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * saldo tabungan selama 6 bulan
 */
public class PBO310117089Latihan19Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int saldoAwal,bulan,bunga;
        saldoAwal = 2500000;

 
        for(bulan=0; bulan<=6; bulan++){
         bunga = saldoAwal*15/100;
         if (bulan != 0)
         System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + saldoAwal+"\n");
         saldoAwal+=bunga;
        }
        System.out.println("Developed by : Shendi Permana");
        System.out.println("===========A.Doyen===========");       
    }
}
        
    

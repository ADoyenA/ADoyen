/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan20.targetsaldo;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * saldo tabungan sampai target 6.000.000
 */
public class PBO310117089Latihan20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal,bulan,bunga;
        bulan = 0;

        for(saldoAwal=3500000; saldoAwal<=6500000; saldoAwal+=bunga){  
         bunga = saldoAwal*8/100;
         if (bulan != 0)
         System.out.println("Saldo di bulan ke-"+ bulan +" Rp. " + saldoAwal+"\n");
         bulan++;
        }
        
        System.out.println("Developed by : Shendi Permana");
        System.out.println("===========A.Doyen===========");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan36.targetsaldo;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * saldo tabungan sampai mencapai target saldo
 */
public class PBO310117089Latihan36TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tabungan uang = new Tabungan();
        
        uang.saldo = 3500000;
        uang.bunga = 8;
        int targetSaldo = 6000000;
        
        uang.hitungSaldoTarget(uang.saldo, targetSaldo);
        
    }
    
}

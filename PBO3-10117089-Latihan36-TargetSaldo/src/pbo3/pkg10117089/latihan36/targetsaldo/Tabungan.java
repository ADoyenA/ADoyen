/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan36.targetsaldo;

/**
 *
 * @author a
 */
public class Tabungan {
    public int saldo;
    public int bunga;
    
    public double hitungBunga(int parSaldo, int parBunga){
        return parSaldo*parBunga/100;
    } 
    public void hitungSaldoTarget(int parSaldo, int parTarget){
        int no = 1;
        while (parSaldo <= parTarget){
            hitungBunga(parSaldo, bunga);
            parSaldo += hitungBunga(parSaldo, bunga);
            
            String mataUang = String.format
        ("Rp.%,3d", parSaldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" +no+ " %s \n",mataUang);
            no++;
        }
    }
    
}

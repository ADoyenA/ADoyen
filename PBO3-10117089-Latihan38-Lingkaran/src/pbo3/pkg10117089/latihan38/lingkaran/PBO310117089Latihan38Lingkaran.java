/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan38.lingkaran;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * hasil perhitungan lingkaran
 */
public class PBO310117089Latihan38Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran bulat = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        bulat.validasiInput();
        bulat.hasilPerhitungan(bulat.diameter);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * rata-rata nilai mahasiswa
 */
public class PBO310117089Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa mhs = new Mahasiswa();
        Scanner keyboard = new Scanner(System.in);
        
        int bykMah;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = keyboard.nextInt();
        
        mhs.hitungTotal(mhs.nilai,bykMah);
        mhs.hitungRataNilai(mhs.totalNilai, bykMah);
        
        System.out.println("\n"+"Maka, Rata-rata Nilainya adalah : "
                +mhs.hitungRataNilai(mhs.totalNilai, bykMah));
    }
    
}

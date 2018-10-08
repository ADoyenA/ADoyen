/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * hasil kalkulator
 */
public class PBO310117089Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=======Aplikasi Kalkulator Bilangan=======");
        Kalkulator angka = new Kalkulator();
        System.out.print("Masukkan Angka ke-1 : ");
        angka.value1 = keyboard.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        angka.value2 = keyboard.nextDouble();
        
        System.out.println("\n"+"Hasil Pertambahan : " + angka.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + angka.kurangBilangan());
        System.out.println("Hasil Perkalian : " + angka.kaliBilangan());
        System.out.println("Hasil Pembagian : " + angka.bagiBilangan());
        System.out.println("Hasil Sisa : " + angka.sisaBilangan());
    }
    
}

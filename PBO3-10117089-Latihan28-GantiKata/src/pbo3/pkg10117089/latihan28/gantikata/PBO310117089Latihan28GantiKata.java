/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * kalimat yang sudah di ganti salah satu kata
 */
public class PBO310117089Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String kalimat, replace, kalimat1, ganti;
        
        Scanner keyboard = new Scanner(System.in);
                
        System.out.println("=======Program mengganti kata=======");
        System.out.print("Masukkan Kalimat :");
        kalimat = keyboard.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = keyboard.nextLine();
        System.out.print("Menjadi : ");
        replace = keyboard.nextLine();
        
        kalimat1 = kalimat.replaceAll(ganti, replace);
        
        System.out.println("==========Hasil Foematting==========");
        System.out.println("Kalimat awal : "+kalimat);
        System.out.println("Kalimat baru : "+kalimat1);
    }
    
}

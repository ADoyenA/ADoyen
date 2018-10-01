/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * huruf yang sudah diganti ke besar dan kecil
 */
public class PBO310117089Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        

        
        Scanner keyboard = new Scanner(System.in);
        
        String kalimat;
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = keyboard.nextLine();
 
        String kalimat1 = kalimat.toUpperCase();
        String kalimat2 = kalimat.toLowerCase();
        
        System.out.println("=======Hasil Formatting=========");
        System.out.println("Huruf Besar : " + kalimat1 );
        System.out.println("Huruf Kecil : " + kalimat2);
        
        
        
    }


    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.latihan24.perbandingan;

import com.sun.webkit.dom.KeyboardEventImpl;
import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * perbandingan antara 2 nilai
 */
public class PBO310117089Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        int nilai1,nilai2;
        String jawab ;
        String jawab1 = "Ya";


        while ("Ya".equals(jawab1)){
        Scanner keyboard = new Scanner(System.in);
        

        System.out.println("=====Program Perbandingan nilai======");
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = keyboard.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = keyboard.nextInt();
        if (nilai1 > nilai2){
            System.out.println("Hasil : "+nilai1+" Lebih besar dari "+nilai2);
        }else if (nilai2 > nilai1){
            System.out.println("Hasil : "+nilai2+" Lebih besar dari "+nilai1);
        }
        

        System.out.print("Ulangi Aktifitas (Ya/Tidak) : ");
        jawab = keyboard.next();
        }
    }
}

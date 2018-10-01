/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan21.ratanilai;

import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * rata rata nilai mahasiswa yang di input user
 */
public class PBO310117089Latihan21RataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double banyakMhsw, rata;
        int[] nilai = new int[100];
        
         //scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilan output
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMhsw = keyboard.nextInt();
        int sum = 0;
        for (int no=1; no<=banyakMhsw; no++){    
        System.out.print("Nilai Mahasiswa ke- "+no+" : ");
        nilai[no] = keyboard.nextInt();
        sum+=nilai[no];
        }
        rata = sum/banyakMhsw;
        
        System.out.println("Maka Rata-rata Nilainya adalah "+rata+"\n");
        System.out.println("Developed by : Shendi Permana");
        System.out.println("===========A.Doyen===========");
    }
    
}

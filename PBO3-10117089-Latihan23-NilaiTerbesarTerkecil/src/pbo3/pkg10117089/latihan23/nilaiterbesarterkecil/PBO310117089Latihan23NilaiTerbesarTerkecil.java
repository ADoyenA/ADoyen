/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * nilai terbesar dan terkecil
 */
public class PBO310117089Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPtgs;
        int no, min, max, banyakMhsw;
        int[] nilai = new int[1000];

         //scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilan output
        System.out.println
        ("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        namaPtgs = keyboard.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakMhsw = keyboard.nextInt();
        
        for (no=1; no<=banyakMhsw; no++){    
        System.out.print("Masukkan Nilai Mahasiswa ke- "+no+" : ");
        nilai[no] = keyboard.nextInt();
        }
        max = 0;
        min = 1000;
        System.out.println("\n"+"=========Hasil Nilai Mahasiswa=========");
        for (no=1; no<=nilai[no];no++){
        if (nilai[no]>max){
            max = nilai[no];
        }
        else if (nilai[no]<min){
            min= nilai[no];
        }
        System.out.print("Nilai Mahasiswa ke- "+no+" : "+nilai[no]+"\n");
        }
        System.out.println("\n"+"Nilai Terbesar adalah "+max);
        System.out.println("Nilai Terkecil adalah "+min+"\n");
        System.out.println("Petugas "+namaPtgs+"\n");
        
        System.out.println("\n"+"Developed by : Shendi Permana");
        System.out.println("===========A.Doyen===========");
    }
    
}

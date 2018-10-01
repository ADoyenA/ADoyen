/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan22.lingkaran;

import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * hasil perhitungan lingkaran
 */
public class PBO310117089Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String diameter; 
        double  ph, jari, luas, keliling;
        ph = 3.14;
        boolean ulang = true;
        
        Scanner Keyboard = new Scanner (System.in);
        
        while (ulang == true ){
        System.out.println("=========Perhitungan Lingkaran=========");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        diameter= Keyboard.next();

        if (diameter.matches("[0-9]*")){
        double d = Double.parseDouble(diameter);
        jari = d/2 ;
        luas = ph*(Math.pow(jari,2)) ;
        keliling = 2*ph*jari;
            System.out.println("======Hasil Perhitungan Lingkaran======");
            System.out.println("Jari-jari Lingkaran = "+jari);
            System.out.println("Luas Lingkaran      = "+luas);
            System.out.println("Kelilng Lingkaran   = "+keliling);
            ulang = false;
    } else{
            System.out.println("Nilai diameter tidak sesuai"); 
        }
        }
        System.out.println("\n"+"Developed by : Shendi Permana");
        System.out.println("===========A.Doyen===========");
    }

}

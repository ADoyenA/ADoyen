/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * tunjungan karyawan 
 */
public class PBO310117089Latihan17Tunjangan {
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //deklarasi variabel
        String status;
        String status1 = "Menikah" ;
        String status2 = "Belum";
        double tunjangan, gaji, total;


        //scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilan output
        System.out.println("===============Program Tunjangan===============");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gaji = keyboard.nextDouble();
        System.out.print("Status anda? (Menikah/Belum)    : ");
        status = keyboard.next();
        
        //menampilkan yang sudah di simpan di variabel

        if (status.equals(status1)) {
        tunjangan = (int) (gaji * 0.35);
        total = (int) (gaji + tunjangan);              
         System.out.println("==========Hasil Perhitungan Gaji Anda==========");
         System.out.println("Gaji Pokok           : Rp " + gaji);
         System.out.println("Tunjangan            : Rp " + tunjangan);
         System.out.println("Total Gaji           : Rp " + total);
        }else if (status.equals(status2)){
        tunjangan = 0;
        total = (int) (gaji + tunjangan);  
         System.out.println("==========Hasil Perhitungan Gaji Anda==========");
         System.out.println("Gaji Pokok           : Rp " + gaji);
         System.out.println("Tunjangan            : Rp ");
         System.out.println("Total Gaji           : Rp " + total);   
        }else{
         System.out.println("Maaf status yang anda masukkan salah, "
                   + "harap di isi antara "+status1+ " atau " +status2+" !!!!");
        }
        System.out.println("\n"+"Developed by : Shendi Permana");
        System.out.println("===========A.Doyen===========");
       
    }
}    

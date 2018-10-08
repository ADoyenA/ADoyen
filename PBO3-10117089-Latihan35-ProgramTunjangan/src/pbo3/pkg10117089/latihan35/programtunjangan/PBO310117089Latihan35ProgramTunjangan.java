/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan35.programtunjangan;

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
public class PBO310117089Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        Karyawan younglex = new Karyawan();
        
        System.out.println("=======Program Tunjangan=======");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        younglex.gaji = keyboard.nextDouble();
        System.out.print("Status anda? (Menikah/Belum)    : ");
        younglex.status = keyboard.next();
        
        System.out.println("\n"+"=====Hasil Perhitungan Gaji=====");
        younglex.cekStatus();

        System.out.println("\n"+"Developed by : Shendi Permana");
        System.out.println("===========A.Doyen===========");
       
        
    }
    
}

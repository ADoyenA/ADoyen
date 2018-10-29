/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class PBO310117089Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner (System.in);
        
         Manager kry1 = new Manager();
         System.out.println("=======Program Perhitungan Gaji Karyawan=======");
         System.out.print("Masukkan NIK : ");
         kry1.setNik(keyboard.next());
         kry1.setNama(keyboard.nextLine());
         System.out.print("Masukkan Nama : ");
         kry1.setNama(keyboard.nextLine());
         System.out.print("Masukkan Golongan (1/2/3) : ");
         kry1.setGolongan(keyboard.nextInt());
         System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
         kry1.setJabatan(keyboard.next().toUpperCase());
         System.out.print("Masukkan Jumlah Kehadiran : ");
         kry1.setKehadiran(keyboard.nextInt());
         
         System.out.println("\n" + "========Hasil Perhitungan========");
         System.out.println("NIK : " + kry1.getNik());
         System.out.println("NAMA : " + kry1.getNama());
         System.out.println("GOLONGAN : " + kry1.getGolongan());
         System.out.println("JABATAN : " + kry1.getJabatan());
         
         System.out.println("\n"+"TUNJANGAN GOLONGAN : " 
                 + kry1.tunjanganGolongan(kry1.getGolongan()));
         System.out.println("TUNJANGAN JABATAN : " 
                 + kry1.tunjanganJabatan(kry1.getJabatan()));
         System.out.println("TUNJANGAN KEHADIRAN : " 
                 + kry1.tunjanganKehadiran(kry1.getKehadiran()));
         
         System.out.println("GAJI TOTAL : " + kry1.gajiTotal());
    }
     
}

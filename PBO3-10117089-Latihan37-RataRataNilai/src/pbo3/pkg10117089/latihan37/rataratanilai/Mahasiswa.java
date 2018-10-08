/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Mahasiswa {
    public int nilai;
    public double totalNilai;
    
    public double hitungTotal(int parNilai, int parBykMhs){
    Scanner keyboard = new Scanner(System.in);
     for (int no=1; no<=parBykMhs; no++){
         System.out.print("Nilai Mahasiswa ke-"+no+" : ");
         parNilai = keyboard.nextInt();
         totalNilai += parNilai;
     }
     return 0;
    }
    public double hitungRataNilai(double parTotal, int bykMhs){
        
        return parTotal/bykMhs;
    }
}

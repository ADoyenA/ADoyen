/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan38.lingkaran;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class Lingkaran {
    public double diameter;
    public double jari2;
    
    public double hitungJarijari(double parDiameter){
        return parDiameter/2;
    }
    
    public double hitungLuas(double parJari2){
        return Math.PI*(Math.pow(parJari2, 2));
    }
    
    public double hitungKeliling(double parJari2){
        return 2*Math.PI*parJari2;
    }
    public void validasiInput(){
     
    Scanner Keyboard = new Scanner (System.in);
    String d;
    do {
        System.out.print("Masukkan nilai diameter lingkaran : ");
        d = Keyboard.nextLine();
        System.out.println((!d.matches("[0-9]*"))?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        diameter = Double.parseDouble(d);  
    }
    
    public void hasilPerhitungan(double parDiameter){
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran %.2f cm %n",
                    hitungJarijari(parDiameter));
        System.out.printf("Luas Lingkaran %.2f cm %n ",
                    hitungLuas(hitungJarijari(parDiameter)));
        System.out.printf("Kelilng Lingkaran %.2f cm %n", 
                    hitungKeliling(hitungJarijari(parDiameter)));
        
        System.out.println("\n"+"Developed by : Shendi Permana");
        System.out.println("===========A.Doyen===========");
    }
}

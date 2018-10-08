/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan35.programtunjangan;

/**
 *
 * @author a
 */
public class Karyawan {
    
    public double gaji;
    public String status;
    public double tunjangan;
    public double total;
    
    public void cekStatus(){
        String sts = status.toUpperCase();
        switch (sts){
            case "MENIKAH":
                tunjangan = gaji*0.35;
                total = gaji + tunjangan; 
                System.out.println("Gaji Pokok : " + gaji);
                System.out.println("Tunjangan : " + tunjangan);
                System.out.println("Total Gaji : " + total);
                break;        
            case "BELUM":
                tunjangan = 0;
                total = gaji + tunjangan;
                System.out.println("Gaji Pokok : " + gaji);
                System.out.println("Tunjangan : " + tunjangan);
                System.out.println("Total Gaji : " + total);
                break;
            default:
                System.out.println("Maaf status yang anda masukkan salah");
                break;
        }
    }
    
    
}

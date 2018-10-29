/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan51.gajikaryawan;

/**
 *
 * @author a
 */
public class Manager extends Karyawan{
    
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran; 

    
    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        return hadir * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        float tunjangan;
         if (null == jabatan){
             tunjangan = 0;
         }else switch (jabatan) {
            case "MANAGER":
                tunjangan = 2000000;
                break;
            case "KABAG":
                tunjangan = 1000000;
                break;
            default:
                tunjangan = 0;
                break;
        }
        
        return tunjangan;
         
    }
    
    public float tunjanganGolongan(int golongan){
       int tunjangan;
        switch (golongan){
            case 1:
                tunjangan = 500000;
                break;
            case 2:
                tunjangan = 1000000;
                break;
            case 3:
                tunjangan = 1500000;
                break;
            default:
                tunjangan = 0;
                break;
        }
        return tunjangan;
    }
    
    public float gajiTotal(){
        return tunjanganGolongan(getGolongan()) + tunjanganJabatan(getJabatan()) + 
                tunjanganKehadiran(getKehadiran()) ;
    }
}

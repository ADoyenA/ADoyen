/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan52.siapakamu;

/**
 *
 * @author a
 */
public class PBO310117089Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dosen mns1 = new Dosen();
        mns1.setNama("Rizki Adam Kurniawan");
        mns1.setUmur(27);
        mns1.setNip("41227829930");
        mns1.setMatakuliah("PBO");
        System.out.println("NIP DOSEN : " + mns1.getNip());
        mns1.siapaKamu();
        mns1.mengajarApa();
        
        Mahasiswa mns2 = new Mahasiswa();
        mns2.setNim("10117089");
        mns2.setKelas("PBO3");
        mns2.setNama("Shendi Permana");
        mns2.setUmur(19);
        System.out.println("\n"+"NIM MAHASISWA : " + mns2.getNim());
        mns2.siapaKamu();
        mns2.kelasApa();
    }
    
}

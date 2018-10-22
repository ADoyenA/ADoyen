/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan47.nilaimahasiswa;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * nilai akhir mahasiswa
 */
public class PBO310117089Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa nilai1 = new NilaiMahasiswa();
        
        nilai1.setQuis(80);
        nilai1.setUts(80);
        nilai1.setUas(75);
        
        System.out.println("Quiz               = " + nilai1.getQuis());
        System.out.println("UTS                = " + nilai1.getUts());
        System.out.println("UAS                = " + nilai1.getUas());
        System.out.println("\n"+"Nilai Akhir        = " 
                + nilai1.rumusNilaiAkhir());
       System.out.println("\n"+"Index              = " + 
               nilai1.aturanIndex(nilai1.rumusNilaiAkhir(),nilai1.getIndex()));
       System.out.println("Keterangan         = " + nilai1.aturanKeterangan
        (nilai1.aturanIndex(nilai1.rumusNilaiAkhir(),nilai1.getIndex())
                ,nilai1.getKeterangan()));
    }
    
}

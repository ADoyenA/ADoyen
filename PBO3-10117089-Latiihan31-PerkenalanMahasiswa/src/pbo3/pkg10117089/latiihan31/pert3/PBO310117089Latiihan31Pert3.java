/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117089.latiihan31.pert3;



/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * mahasiswa yang memperkenalkan diri
 */
public class PBO310117089Latiihan31Pert3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10117089";
        mhs1.nama = "Shendi Permana";
        mhs1.perkenalanDiri(mhs1.nim,mhs1.nama);
   
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "10117085";
        mhs2.nama = "A.Doyen";
        mhs2.perkenalanDiri(mhs2.nim,mhs2.nama);
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "10117082";
        mhs3.nama = "A.Doyen.A-";
        mhs3.perkenalanDiri(mhs3.nim,mhs3.nama);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan59.detectiveconan;

/**
 *
 * @author a
 */
public class Mahasiswa extends Manusia {
    
    private String Nim;

    public Mahasiswa(String nama, String jenisKelamin, int umur) {
        super(nama, jenisKelamin, umur);
    }

    @Override
    public void profesi() {
        System.out.println("Aku seorang Mahasiswa\n");
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan56.umurbarangantik;

/**
 *
 * @author a
 */
public class Radio extends BarangAntik {
    
    private String name;

    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void tampilUmur() {
        System.out.println("Nama Barang antik : " + getName());
        super.tampilUmur(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan54.koordinat;

/**
 *
 * @author a
 */
public class WarnaKoordinat  extends Koordinat{
    
    public String namawarna;

    public WarnaKoordinat(String namawarna, int x, int y) {
        super(x, y);
        this.namawarna = namawarna;
        System.out.println("Warna Koordinat : " + namawarna);
        System.out.println("Koordinat Sumbu x : " + x + ", y : " + y);
    }

    public String getNamawarna() {
        return namawarna;
    }

    public void setNamawarna(String namawarna) {
        this.namawarna = namawarna;
    }
    
    
    
}

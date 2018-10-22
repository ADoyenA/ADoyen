/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan47.nilaimahasiswa;

/**
 *
 * @author a
 */
public class NilaiMahasiswa {
    private double quis;
    private double uts;
    private double uas;
    private double NA;
    private char index;
    private String keterangan;
    
    
    public double getNA() {
        return NA;
    }

    public char getIndex() {
        return index;
    }

    public double getQuis() {
        return quis;
    }

    public void setQuis(double quis) {
        this.quis = quis;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public String getKeterangan() {
        return keterangan;
    }

    
    public char aturanIndex (double NA, char index){
        if ((0<=NA)&&(NA<=45)){
                index = ('E');
        }else if ((45<NA)&&(NA<=56)){
                index = ('D');
        }else if ((56<NA)&&(NA<=68)){
                index = ('C');
        }else if ((68<NA)&&(NA<=80)){
                index = ('B');
        }else if ((80<NA)&&(NA<=100)){
                index = ('A');
        }
        return index;
    }
    public String aturanKeterangan (char index, String keterangan){
        
        switch (index) {
            case 'A':
                keterangan = ("Sangat Baik");
                break;
            case 'B':
                keterangan = ("Baik");
                break;
            case 'C':
                keterangan = ("Cukup");
                break;
            case 'D':
                keterangan = ("Kurang");
                break;
            case 'E':
                keterangan = ("Sangat Kurang");
                break;
            default:
                break;
        }
        return keterangan;
    }
    public double rumusNilaiAkhir (){
        return (getQuis()*0.2)+(getUts()*0.3)+(getUas()*0.5);
    }
    
}
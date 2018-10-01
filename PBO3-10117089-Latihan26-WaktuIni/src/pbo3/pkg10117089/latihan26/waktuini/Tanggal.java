/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117089.latihan26.waktuini;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author a
 */
public class Tanggal {
    
    public String getTanggal(){
        DateFormat dateFormat = new SimpleDateFormat(" EEEE dd MMM YYYY HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
}

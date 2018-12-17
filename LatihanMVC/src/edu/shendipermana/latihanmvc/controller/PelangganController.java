/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.shendipermana.latihanmvc.controller;

import edu.shendipermana.latihanmvc.model.pelangganModel;
import edu.shendipermana.latihanmvc.view.pelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author a
 * NAMA     : Shendi Permana
 * Kelas    : PBO3
 * NIM      : 10117089
 */
public class PelangganController {
    
    private pelangganModel model;

    public void setModel(pelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(pelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.equals("") && (email.equals("") && (noTlp.equals("")))) {
            
        }else{
            model.resetForm();
        }
        
    }
    
    public void simpanForm(pelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"Nama Masih Kosong");
        }else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"E-mail Masih Kosong");
        }else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"No.Telepon Masih Kosong");
        }else{
            model.simpanForm();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import javax.faces.event.ActionEvent;


/**
 *
 * @author husey
 */
public class YonetimliBean2 {
    public String onayVerAction(){
        String sonuc = "Action methodu çalıştırıldı";
        System.out.println(sonuc);
        return sonuc;
    }
    
    public void onayVerActionListener(ActionEvent actionEvent){
        System.out.println("actionlistener methodu çalıştırıldı");
        String parametreAdi = (String)actionEvent.getComponent().getAttributes().get("p_adi");
        String parametreSoyadi = (String)actionEvent.getComponent().getAttributes().get("p_soyadi");
        System.out.println(" Te burda " + parametreAdi + " " + parametreSoyadi);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
public class YonetimliBean {

    /**
     * Creates a new instance of YonetimliBean
     */
    private String isim;
    private String soyadIsim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyadIsim() {
        return soyadIsim;
    }

    public void setSoyadIsim(String soyadIsim) {
        this.soyadIsim = soyadIsim;
    }
    public void yazdirMetodu(){
        System.out.println(getIsim() + " " + getSoyadIsim());
    }
    
}

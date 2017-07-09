/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

/**
 *
 * @author husey
 */
public class YonetimliBean3 {

    /**
     * Creates a new instance of YonetimliBean3
     */
    private String adi;
    private String soyadi;
    private String deneyim;
    public YonetimliBean3() {
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getDeneyim() {
        return deneyim;
    }

    public void setDeneyim(String deneyim) {
        this.deneyim = deneyim;
    }
    
    public void yazdirMetodu(){
        System.out.println(getAdi() + " " + getSoyadi() + " " + getDeneyim());
    }
}

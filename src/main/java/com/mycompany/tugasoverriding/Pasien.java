/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasoverriding;

/**
 *
 * @author naffsisky
 */
public class Pasien {
    private String nama;
    private int umur;
    
    public Pasien(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    public void perkenalan(){
        System.out.println("Hai, saya " + this.nama + " dan umur saya " + this.umur + " tahun");
    }
    public void role(){
        System.out.println("Saya adalah Pasien di Rumah Sakit");
    }
}

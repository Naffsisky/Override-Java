/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasoverriding;

/**
 *
 * @author naffsisky
 */
public class Perawat extends Pasien {
    public String skill;
    
    public Perawat(String nama, int umur, String skill){
        super(nama, umur);
        this.skill = skill;
    }
    
    public void role(){
        System.out.println("Saya adalah Perawat yang mempunyai keahlian " + this.skill + " pasien");
    }
    
    public void role(int pengalaman){
        System.out.println("Saya sudah berpengalaman selama " + pengalaman + " tahun");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasoverriding;

/**
 *
 * @author naffsisky
 */
public class Dokter extends Perawat {
    private String spesialis;
    
    public Dokter(String nama, int umur, String skill, String spesialis){
        super(nama, umur, skill);
        this.spesialis = spesialis;
        this.skill = skill;
    }
    
    public void role(){
        System.out.println("Saya adalah Dokter dengan spesialis " + this.spesialis + " dan keahlian " + this.skill);
    }
    
    public void role(int pengalaman){
        System.out.println("Saya sudah berpengalaman selama " + pengalaman + " tahun dalam spesialis " + this.spesialis);
    }
}

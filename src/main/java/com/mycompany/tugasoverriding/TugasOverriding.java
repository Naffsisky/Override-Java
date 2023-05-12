/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasoverriding;
import java.util.Scanner;

/**
 *
 * @author naffsisky
 */
public class TugasOverriding {

    public static void main(String[] args) {
        Pasien pasien1 = new Pasien("Dhany", 18);
        pasien1.perkenalan();
        pasien1.role();
        System.out.println("----");
        Perawat perawat1 = new Perawat("Rena", 19, "Merawat");
        perawat1.perkenalan();
        perawat1.role();
        perawat1.role(7);
        System.out.println("----");
        Dokter dokter1 = new Dokter("Prinaf", 20, "Organ dalam", "Bedah");
        dokter1.perkenalan();
        dokter1.role();
        dokter1.role(10);
    }
}

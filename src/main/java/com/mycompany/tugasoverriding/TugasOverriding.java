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
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nama Pasien : ");
        String namaPasien = input.nextLine();
        System.out.print("Masukan umur Pasien : ");
        int umurPasien = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukan nama Perawat : ");
        String namaPerawat = input.nextLine();
        System.out.print("Masukan umur Perawat : ");
        int umurPerawat = input.nextInt();
        input.nextLine();
        System.out.print("Masukan skill Perawat : ");
        String skillPerawat = input.nextLine();
        System.out.print("Masukan pengalaman Perawat : ");
        int pengalamanPerawat = input.nextInt();
        input.nextLine();
      
        System.out.print("Masukan nama Dokter : ");
        String namaDokter = input.nextLine();
        System.out.print("Masukan umur Dokter : ");
        int umurDokter = input.nextInt();
        input.nextLine();
        System.out.print("Masukan skill Dokter : ");
        String skillDokter = input.nextLine();
        System.out.print("Masukan spesialis Dokter : ");
        String spesialisDokter = input.nextLine();
        System.out.print("Masukan pengalaman Dokter : ");
        int pengalamanDokter = input.nextInt();
        input.nextLine();
        
//        Output
        Pasien pasien1 = new Pasien(namaPasien, umurPasien);
        pasien1.perkenalan();
        pasien1.role();
        System.out.println("----");
        Perawat perawat1 = new Perawat(namaPerawat, umurPerawat, skillPerawat);
        perawat1.perkenalan();
        perawat1.role();
        perawat1.role(pengalamanPerawat);
        System.out.println("----");
        Dokter dokter1 = new Dokter(namaDokter, umurDokter, skillDokter, spesialisDokter);
        dokter1.perkenalan();
        dokter1.role();
        dokter1.role(pengalamanDokter);
    }
}

package pboif2.pkg10119065.latihan46.tandanyakamu;

import java.util.Calendar;
import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program tandanya kamu
 *                         dengan objek
 */
public class PBOIF210119065Latihan46TandanyaKamu {
    public static int yearNow, umur;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearNow);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(sc.nextInt());
        
        System.out.println("==========Hasil Perhitungan Umur============");
        System.out.println("Tahun lahir anda: "+age.getYearBirth());
        System.out.println("Hari ini tahun: "+age.getYearNow());
        System.out.println("Umur kamu samapai hari ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu "+age.tandanyaKamu(age.hitungUmur()));
    }
    
}

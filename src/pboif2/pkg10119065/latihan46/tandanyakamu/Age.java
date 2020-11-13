package pboif2.pkg10119065.latihan46.tandanyakamu;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program tandanya kamu
 *                         dengan objek
 */
public class Age {
    private int yearBirth,yearNow;
    private String red ="\u001B[31m";
    
    public Age(int yearNow) {
       this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public void setYearNow(int yearNow) {
        this.yearNow = yearNow;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur)
    {
        String ket;
        if(umur >= 0 && umur <= 5) ket = "LAGI LUCU-LUCUNYA";
        else if(umur > 5 && umur <= 10) ket = "MASIH ANAK ANAK";
        else if(umur > 10 && umur <= 13) ket = "MASIH REMAJA";
        else if(umur > 13 && umur <= 19) ket = "ALAY";
        else if(umur > 19 && umur <= 29) ket = "LAGI GALAU NYARI JODOH";
        else if(umur > 29 && umur <= 35) ket = "LAGI SIBUK NYARI UANG";
        else if(umur > 35 && umur <= 150) ket = "SUDAH TUA";
        else ket = "TIDAK TERDETEKSI DI KEHIDUPAN";
        
        return red + ket;
    }
}

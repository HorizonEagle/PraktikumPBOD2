/*
file        : BangunDatar.java
Deskripsi   : abstark bangun datar
Nama        : Ali Maskan Ferry Purwanto
tanggal     : 17/03/2026
*/


abstract class BangunDatar {
private int jmlsisi;
private String warna;
private String border;
private static int counterBangunDatar=0;

public abstract double getLuas(); 
public abstract double getKeliling(); 

public BangunDatar(){
        counterBangunDatar++;
}

public BangunDatar (int jmlsisi,String warna,String border) {
    this.jmlsisi = jmlsisi;
    this.warna = warna;
    this.border = border;
    counterBangunDatar++;

}



public int getJmlSisi () {
        return jmlsisi;
}

public void setJmlSisi (int jmlSisi) {
this.jmlsisi= jmlSisi;
}
public String getWarna () {
    return warna;
}
public void setWarna (String warna) {
    this.warna = warna;
}

public String getBorder () {
return border;
}
public void setBorder (String border) {
this.border = border;
}

public void printInfo () {
    System. out.println ("Jumlah sisi: " + jmlsisi) ;
    System. out.println ("Warna: " + warna) ;
    System. out.println ("Border: " + border) ;
}

public static void printCounterBangunDatar(){
    System.out.println("Jumlah Objek Bangun Datar = "+counterBangunDatar);
}

}
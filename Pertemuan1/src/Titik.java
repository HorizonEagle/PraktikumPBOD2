/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam Class titik
 * Pembuat      : Ali Maskan Ferry Purwanto
 * Tanggal      : 20/02/2026
*/


public class Titik {
/**********Atribut***********/
    double Absis;
    double Ordinat;

/**********Method***********/
    //Konstruktor membuat Titik (0,0)
    Titik(){
        Absis = 0;
        Ordinat = 0;
    }

    //Selector mengembalikan nilai absis//
    double getAbsis(){
        return Absis;
    }

    //selector mengembalikan nilai ordinat
    double getOrdinat(){
        return Ordinat;
    }

    //Mengubah nilai Absis dengan nilai baru x
    void setAbsis(double x){
        Absis = x;
    }

    //Mengubah nilai ordinat dengan nilai baru y
    void setOrdinat(double y){
        Ordinat = y;
    }

    //Menggeser nilai Absis dan Ordinat sesuai nilai x dan y
    void geser(double x,double y){
        Absis += x;
        Ordinat += y;
    }

    void printTitik(){
        System.out.println("Titik (" + Absis + "," + Ordinat + ")");
    }
}
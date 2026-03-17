/*
file        : Lingkaran.java
Deskripsi   : isinya Lingkaran
Nama        : Ali Maskan Ferry Purwanto
tanggal     : 17/03/2026
*/

public class Lingkaran extends BangunDatar implements IResize{
   
    //Atribut
    private double jari;


    //Konstruktor
    public Lingkaran(){
        setJmlSisi(1);
    }
    public Lingkaran(double jari,String warna,String border){
        super(1,warna,border);
        this.jari = jari;
    }

    //Selector
    public double getJari(){
        return this.jari;
    }

    //Mutator
    public void setJari(double jari){
        this.jari = jari;
    }

    //Fungis2
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return Math.PI * 2 * jari;
    }

     @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int Percent){
        jari = jari * Percent/100;
    }
}

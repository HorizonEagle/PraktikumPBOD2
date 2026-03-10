public class Lingkaran extends BangunDatar{
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
}

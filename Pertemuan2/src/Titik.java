/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam Class Garis
 * Pembuat      : Ali Maskan Ferry Purwanto
 * Tanggal      : 24/02/2026
*/

public class Titik {
    //Atribut dari class titik//
    private double absis;
    private double ordinat;
   static int Counter = 0;

    //********Method**********/
    //Konstruktor
    public Titik(){
    absis = 0;
    ordinat = 0;
    Counter++;
    }

    public Titik(double a,double b){
        this.absis = a;
        this.ordinat = b;
    }

     //Selector mengembalikan nilai absis//
    public double getAbsis(){
        return absis;
    }

    //selector mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }
    //Mengubah nilai Absis dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //Mengubah nilai ordinat dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser nilai Absis dan Ordinat sesuai nilai x dan y
    public void geser(double x,double y){
        absis += x;
        ordinat += y;
    }

    //Menunjukkan koordinat Titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //Mengembalikan jumlah Titik yang telah dibuat
    public int CounterTitik(){
        return Titik.Counter;
    }
    
    //mengembalikan posisi Kuadran, Kudaran 0 jika tidak terdefinisi
    public int getKuadran(){
        int K = 0;
        if(absis > 0 && ordinat > 0)
        {
            K = 1;
        }
        
        else if(absis < 0 && ordinat > 0)
        {
            K = 2;
        }
        
        else if(absis < 0 && ordinat < 0)
        {
            K = 3;
        }
        
        else if (absis > 0 && ordinat < 0)
        {
            K = 4;
        }

        return K;
    }

    //mengembalikan Nilai jarak titik ke pusat origin (0,0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow((absis-0),2) + Math.pow((ordinat-0), 2));
    }
    
    //mengembalikan nilai jarak Titik T1 ke T2
    public double getJarak(Titik T2){
        return Math.sqrt(Math.pow((absis-T2.absis),2) + Math.pow((ordinat-T2.ordinat), 2));

    }

    //merefleksikan terhadap sumbu X
   public  void refleksiX(){
        ordinat = ordinat * -1;
    }
    //merefleksikan terhadap sumbu Y
   public  void refleksiY(){
        absis = absis * -1;
    }

    //membuat Titik baru dengan nilai refleksiX dari titik awal
    public Titik getRefleksiX(Titik A){
        A.absis = this.absis;
        A.ordinat = this.ordinat * -1;
        return A;
    }

    //membuat Titik baru dengan nilai refleksiY dari titik awal

    public Titik getRefleksiY(Titik A){
        A.absis = this.absis * -1;
        A.ordinat = this.ordinat;
        return A;
    }

    
}

public class Garis{

    //********Atribut***********/

    private Titik awal;
    private Titik akhir;
    private static int counterGaris = 0;


    //*********Method***********/
    //konstruktor
    //Buat garis dengan titik A dan B
    public Garis(Titik A,Titik B){
    this.awal = A;
    this.akhir = B;
    counterGaris++;
   }

   public Garis(){
        awal = new Titik();
        akhir = new Titik();
   }
    //Selector
    public Titik getAwal(){
        return awal;
    }

    public Titik getAkhir(){
        return akhir;
    }

    //Mutator
    public void setAwal(Titik awal){
        this.awal = awal;
    }

    public void setAkhir(Titik akhir){
        this.akhir = akhir;
    }
  

   //Hitung Panjang Garis
   public double panjangGaris(){
        return Math.sqrt(Math.pow((awal.getAbsis()-akhir.getAbsis()), 2) + Math.pow(awal.getOrdinat()-akhir.getOrdinat(), 2));
   }

   //mengembalikan banyaknya garis yang telah dibuat
   public int getCounterGaris(){
        return Garis.counterGaris;
    }

    //Gradien
    public double Gradien(){
        double m = 0;
        m = (akhir.getOrdinat() - awal.getOrdinat())/(akhir.getAbsis() - awal.getAbsis());

        return m;
    }

    public Titik titikTengah(){
        Titik T = new Titik();

        T.setAbsis((awal.getAbsis()+akhir.getAbsis())/2);
        T.setOrdinat((awal.getOrdinat()+akhir.getOrdinat())/2);

        return T;
    }

    public boolean garisSejajar(Garis T2){
        if(this.Gradien() == T2.Gradien()){
            return true;
        }else{
            return false;
        }
    }

    public boolean garisTegakLurus(Garis T2){
        if(this.Gradien() == -1*T2.Gradien()){
            return true;
        }else{
            return false;
        }
    }

    public void printGaris(){
        awal.printTitik();
        akhir.printTitik();
    }

    public void persamaanGaris(){
        double m = this.Gradien();
        double x1 = awal.getAbsis();
        double y1 = awal.getOrdinat();

        double c = y1 - m * x1;

        if (c > 0) {
            System.out.println("y = " + m + "x + " + c);
        } else if (c < 0) {
            System.out.println("y = " + m + "x - " + Math.abs(c));
        } else {
            System.out.println("y = " + m + "x");
        }
    }
    

}

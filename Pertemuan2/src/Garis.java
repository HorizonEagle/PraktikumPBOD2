public class Garis{

    //********Atribut***********/

    Titik awal;
    Titik akhir;
    private static int counterGaris = 0;

    //*********Method***********/
    //Buat garis dengan titik A dan B
    Garis(Titik A,Titik B){
    this.awal = A;
    this.akhir = B;
    counterGaris++;
   }

   //Hitung Panjang Garis
   double panjangGaris(){
        return Math.sqrt(Math.pow((awal.getAbsis()-akhir.getAbsis()), 2) + Math.pow(awal.getOrdinat()-akhir.getOrdinat(), 2));
   }

   //mengembalikan banyaknya garis yang telah dibuat
   int getCounterGaris(){
        return Garis.counterGaris;
    }

    //

}

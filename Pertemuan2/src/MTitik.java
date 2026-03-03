/* Nama File    : MTitik.java
 * Deskripsi    : Berisi implementasi fungsi Titik.java
 * Pembuat      : Ali Maskan Ferry Purwanto
 * Tanggal      : 24/02/2026
*/
public class MTitik {
    public static void main(String[] args) {
        //Inisialisasi Titik
        Titik T1 = new Titik();
        Titik T3 = new Titik();
        Titik T4 = new Titik();
        Titik T2 = new Titik(-10,30);

        //mengset absis dan ordinat
        T1.setAbsis(5);
        T1.setOrdinat(10);

        //Menampilkan Titik
        T1.printTitik();
        T2.printTitik();
        T3.printTitik();
        T4.printTitik();

        //getAbsis & rodinat
        System.out.println(T1.getAbsis());
        System.out.println(T1.getOrdinat());

        //jumlah ititk
        double Aa = Titik.Counter;
        System.out.println(Aa);

         //Geser posisi Titik 
        T1.geser(-2, 4);
        T1.printTitik();
        //menghitung jarak terhadap jarak pusat
        System.out.println(T1.getJarakPusat());
        System.out.println(T2.getJarakPusat());

        //mengembalikan posisi kuadran
        System.out.println(T1.getKuadran());
        T1.refleksiX();
        T2.refleksiY();
        //menghitung jarak terhadap titik lainnya
        System.out.println(T1.getJarak(T2));

        T1.refleksiX();
        T2.refleksiY();
        //membuat titik baru yang merefleksikan terhadap sumbu X
        T1.getRefleksiX(T3);
        //membuat titik baru yang merefleksikan terhadap sumbu Y
        T1.getRefleksiY(T4);

        T1.printTitik();
        T3.printTitik();
        T4.printTitik();

    }
}

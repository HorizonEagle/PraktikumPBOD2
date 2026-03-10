/* Nama File    : MGaris.java
 * Deskripsi    : Berisi implementasi fungsi Garis.java
 * Pembuat      : Ali Maskan Ferry Purwanto
 * Tanggal      : 24/02/2026
*/
public class MGaris {

    public static void main(String[] args) {

        Titik A = new Titik(1, 10);
        Titik B = new Titik(-9, 20);
        Titik C = new Titik(3, 6);
        Titik D = new Titik(7, 14);

        Garis G1 = new Garis(A, B);
        Garis G2 = new Garis(C, D);
        Garis G3 = new Garis();   

        System.out.println("Titik awal dan akhir G1:");
        G1.printGaris();

        System.out.println("Titik Awal  : (" + G1.getAwal().getAbsis()  + ", " + G1.getAwal().getOrdinat()  + ")");
        System.out.println("Titik Akhir : (" + G1.getAkhir().getAbsis() + ", " + G1.getAkhir().getOrdinat() + ")");

        System.out.println("Panjang G1  : " + G1.panjangGaris());

        System.out.println("Gradien G1  : " + G1.Gradien());

        Titik tengahG1 = G1.titikTengah();
        System.out.print("Titik Tengah G1: ");
        tengahG1.printTitik();

        System.out.print("Persamaan G1: ");
        G1.persamaanGaris();

        System.out.println("Jumlah Garis dibuat: " + G1.getCounterGaris());

        System.out.println("Titik awal dan akhir G2:");
        G2.printGaris();
        System.out.println("Panjang G2  : " + G2.panjangGaris());
        System.out.println("Gradien G2  : " + G2.Gradien());
        System.out.print("Titik Tengah G2: ");
        G2.titikTengah().printTitik();
        System.out.print("Persamaan G2: ");
        G2.persamaanGaris();

        Titik E = new Titik(0, 5);
        Titik F = new Titik(4, 5);
        G3.setAwal(E);
        G3.setAkhir(F);
        System.out.println("G3 setelah di-set:");
        G3.printGaris();
        System.out.println("Panjang G3  : " + G3.panjangGaris());
        System.out.println("Gradien G3  : " + G3.Gradien());
        System.out.print("Persamaan G3: ");
        G3.persamaanGaris();

        System.out.println("G1 sejajar G2  : " + G1.garisSejajar(G2));
        System.out.println("G1 sejajar G3  : " + G1.garisSejajar(G3));

        System.out.println("G1 tegak lurus G2 : " + G1.garisTegakLurus(G2));
        System.out.println("G1 tegak lurus G3 : " + G1.garisTegakLurus(G3));

        System.out.println("\nTotal Garis dibuat: " + G1.getCounterGaris());
    }
}
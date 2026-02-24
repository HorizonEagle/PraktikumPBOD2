/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam Class Garis
 * Pembuat      : Ali Maskan Ferry Purwanto
 * Tanggal      : 24/02/2026
*/
public class MGaris {
    
    public static void main(String[] args) {
        Titik A = new Titik(1, 10);
        Titik B = new Titik(-9,20);

        Garis G1 = new Garis(A, B);

        System.out.println(G1.panjangGaris());
    }
}

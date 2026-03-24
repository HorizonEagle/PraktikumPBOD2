/**
 * File       : AngkaSial.java
 * Deskripsi  : Program penggunaan exception buatan sendiri
 *              Pengenalan klausa 'throw' dan 'throws'
 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();

        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // Method getMessage() berasal dari kelas Exception
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}
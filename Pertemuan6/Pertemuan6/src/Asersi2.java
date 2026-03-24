/**
 * File       : Asersi2.java
 * Deskripsi  : Program untuk demo asersi, yang akan menolak input
 *              jari-jari lingkaran yang bernilai nol
 */

// Class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        assert (jariJari > 0) : "Jari-jari tidak boleh nol atau negatif!";

        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();

        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
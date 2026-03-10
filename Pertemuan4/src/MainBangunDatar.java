public class MainBangunDatar {
    
    public static void main(String[] args) {
        Persegi kotak = new Persegi();
        Persegi K = new Persegi(4,"Biru","yes");
        Lingkaran L = new Lingkaran();

        L.setJari(77);
        L.printInfo();
       kotak.setSisi(16);
        kotak.setWarna("Kuning");
        kotak.printInfo();
        K.printInfo();

        System.out.println("Persegi Sisi = "+kotak.getSisi());
        System.out.println("Persegi Luas = "+kotak.getLuas());
        System.out.println("Persegi Keliling = "+kotak.getKeliling());
        System.out.println("Persegi Diagonal = "+ kotak.getDiagonal());


        System.out.println("Lingkaran");
        System.out.println("Lingkaran jari2 = "+ L.getJari());
        System.out.println("Lingkaran Luas = "+ L.getLuas() );
        System.out.println("Lingkaran Keliling = "+L.getKeliling());
        

        BangunDatar.printCounterBangunDatar();


        }
}

/*
file        : MainBangunDatar.java
Deskripsi   : Main nya
Nama        : Ali Maskan Ferry Purwanto
tanggal     : 17/03/2026
*/

public class MainBangunDatar {
    
    public static void main(String[] args) {
        Persegi kotak = new Persegi();
        Persegi K = new Persegi(4,"Hitam","iya");
        Lingkaran L = new Lingkaran();
        BangunDatar P1 = new Persegi(10,"Kuning","iya"); 
        Persegi P2 = new Persegi(5,"Ijo","Iya"); 
        BangunDatar L1 = new Lingkaran(7,"oren","iya kayaknya"); 
        Lingkaran LL1 = new Lingkaran(7,"item","yes");

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

        P2.zoomIn();
        P2.printInfo();

        System.out.println("Luas LL1 :"+LL1.getLuas());
        LL1.zoom(300);
        System.out.println("Luas LL1 :"+LL1.getLuas());
        System.out.println("Luas L1 :"+L1.getLuas());
        // L1.zoomOut();
        System.out.println("Luas L1 :"+L1.getLuas());
        
        P1.printInfo();
        P2.printInfo();
        
        }
}

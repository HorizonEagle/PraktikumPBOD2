import java.util.*;

class Teman {
    /*Atribut */
    private List<String> Lnama;
    private int nbelm;

    //Konstruktor
    Teman(){
        this.Lnama = new ArrayList<>();
        nbelm = 0;
    }

    //getter
    public int getNbelm(){
        return nbelm;
    }
    public String getNama(int index){
        try {
            return Lnama.get(index);

        } catch (Exception e) {
throw new IllegalArgumentException("Nama yg dicari gaada");     
   }
    }

    //setter
    public void setNama(int index,String nama){
        Lnama.set(index, nama);
        nbelm++;
    }
    //Method
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }
    public void delNama(String nama){
        
            if(isMember(nama)){
                Lnama.remove(nama);
                nbelm--;
            }
        
    }

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama,String namabaru){
        try {
            for(String i : Lnama){
            if(i == nama){
                i = namabaru;
            }
        }
        } catch (Exception e) {
            throw new IllegalArgumentException("Nama yg dicari gaada");
        }
    }

    public int countNama(String nama){
        int count = 0;
        for(String i : Lnama){
            if(i == nama){
                count++;
            }
        }

        return count;
    }

    public void showTeman(){
        System.out.println("\n");
        for(String i : Lnama){
            System.out.println(i);
        }
    }
    
}


abstract class Anabul {
    /*Atribut */
    private String panggilan;
    

    //Konstruktor
    Anabul(String panggilan){
        this.panggilan = panggilan;
    }
    //getter
    public String getNama(){
        return panggilan;
    }

    //setter
    public void setNama(String nama){
        panggilan = nama;
    }
    //Abstract Method
    abstract void Gerak();
    abstract void Bersuara();
}

class Kucing extends Anabul{
    //Atribut
    private double bobot;
    //Konstruktor
    Kucing(String panggilan,double bobot){
        super(panggilan);
        this.bobot = bobot;
    }

    //Method
    //getter 
    public double getBobot(){
        return bobot;
    }
    @Override
    public void Gerak(){
        System.out.println("Kucing Melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Kucing Meong");
    }
}

class Anjing extends Anabul{
    //Konstruktor
    Anjing(String panggilan){
        super(panggilan);
    }

    //method

     @Override
    public void Gerak(){
        System.out.println("Anjing Melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Anjing Guk-Guk");
    }
    
}

class Burung extends Anabul{
    //Konstruktor
    Burung(String panggilan){
        super(panggilan);
    }


    //Method
    @Override
    public void Gerak(){
        System.out.println("Burung Terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println("Burung cuit");
    }

}

class Anggora extends Kucing{

    //Konstruktor
    Anggora(String panggilan,Double bobot){
        super(panggilan, bobot);
    }
}

class Kembangtelon extends Kucing{

    //Konstruktor
    Kembangtelon(String panggilan,Double bobot){
        super(panggilan, bobot);
    }


}


class Piaraan{
    /*Atribut */
    private List<Anabul> Lanabul;
    private int nbelm;

    //konstruktor
    Piaraan(){
        Lanabul = new ArrayList<>();
        nbelm = 0;
    }
    //getter
    public int getNbelm(){
        return nbelm;
    }

    public Anabul getAnabul(){
        return Lanabul.get(0);
    }


    //method
    public void enqueueAnabul(Anabul anabul){
        Lanabul.add(nbelm,anabul);
        nbelm++;
    }

    public void dequeueAnabul(){
        if(nbelm >0){
            Lanabul.remove(0);
            nbelm--;
        }
    }

    public void showAnabul(){
        System.out.println("\n");
        for(Anabul i : Lanabul){
            System.out.println(i.getNama());
        }
    }

    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }   

    public int countKucing(){
        int jum = 0;

        for(Anabul i : Lanabul){
            if( i instanceof Kucing){
                jum++;
            }
        }
        return jum;
    }

    public double bobotKucing(){
        double jum = 0;

        for(Anabul i : Lanabul){
            if( i instanceof Kucing){
                Kucing k = (Kucing) i;
                jum += k.getBobot();
            }
        }
        return jum;
    }

    public void showJenisAnabul(){
        for(Anabul i : Lanabul){
            System.out.println("Nama : "+i.getNama()+"\tClass : "+i.getClass());
        }
    }

}
public class Koleksi {
    public static void main(String[] args) throws Exception {
        //no 1.
        Teman T1 = new Teman();

        T1.addNama("Azka");
        T1.addNama("Menza");
        T1.addNama("Basil");
        T1.addNama("Lutfi");
        T1.addNama("Hasta");
        T1.addNama("Ijat");
        T1.addNama("Nopal");
        T1.addNama("Devano");
        T1.addNama("Marchel");
        T1.addNama("Caesar");
        T1.addNama("Dinda");
        T1.addNama("Elza");
        T1.addNama("Bayu");
        T1.addNama("Atta");
        T1.addNama("Rama");
        T1.addNama("Ferry");
        T1.addNama("Opan");
        T1.addNama("Hanif");
        T1.addNama("Gahftan");
        
        T1.addNama("Novelya");

        
        System.out.println("jumlah Teman : "+T1.getNbelm());

        System.out.println("get Nama ke 0 : "+ T1.getNama(0));

        T1.setNama(0, "Gara");

        T1.showTeman();

        T1.delNama("Basil");
        T1.showTeman();


        System.out.println("\n apakah Lutfi ada ? ");
        if(T1.isMember("Lutfi")){
            System.out.println("Lutfi ada");
        }else{
            System.out.println("Lutfi gaada");
        }

        System.out.println("Nama Azka ada : "+T1.countNama("Azka") + " orang");

        //No 2
        Anggora K1 = new Anggora("Meong", 5.2);
        Kembangtelon K2 = new Kembangtelon("Oscar", 6.9);
        Anjing A1 = new Anjing("guguk");
        Burung B1 = new Burung("citcit");
        Piaraan P = new Piaraan();
        Anggora K3 = new Anggora("Budi", 8.2);

        //2 b
        P.enqueueAnabul(B1);
        P.enqueueAnabul(K1);
        P.enqueueAnabul(K2);
        P.enqueueAnabul(K3);
        P.enqueueAnabul(A1);
        System.out.println("Jumlah piaraan : "+P.getNbelm());
        System.out.println("Anabul awal sebelum dequeue : "+P.getAnabul());

        P.dequeueAnabul();
        System.out.println("Anabul awal setelah dequeue : "+P.getAnabul());
       
        //4.c
        P.showAnabul();

        //4.d
        System.out.println("Kucing ada :" + P.countKucing());

        //4.e
        System.out.println("Bobot semua kucing ada : "+P.bobotKucing()+" Kg");

        //4.f
        P.showJenisAnabul();

    }
}

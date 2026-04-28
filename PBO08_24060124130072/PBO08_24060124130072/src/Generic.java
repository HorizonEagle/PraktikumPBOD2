
abstract class Anabul {
    /*Atribut */
    private String Nama;

    //Konstruktor
    Anabul(String Nama){
        this.Nama = Nama;
    }
    //getter
    public String getNama(){
        return Nama;
    }

    //Abstract Method
    abstract void Gerak();
    abstract void Bersuara();
}

class Kucing extends Anabul{
    //Atribut
    private double bobot;
    //Konstruktor
    Kucing(String Nama,double bobot){
        super(Nama);
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
    Anjing(String Nama){
        super(Nama);
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
    Burung(String Nama){
        super(Nama);
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
    Anggora(String Nama,Double bobot){
        super(Nama, bobot);
    }
}

class Kembangtelon extends Kucing{

    //Konstruktor
    Kembangtelon(String Nama,Double bobot){
        super(Nama, bobot);
    }
}

class Datum <idk> {
    //Atribut
    private idk isi;

    //Method
    //getter
    public idk getIsi(){
        return isi;
    }

    //setter
    public void setIsi(idk isi){
        this.isi = isi;
    }

}


class OperatorGenerik <T>{
    //Method
    public static <T> void Tukar(T a,T b){
        System.out.println("Sebelum ditukar, : "+a+" dan : "+ b);
        T tmp = a;
        a = b;
        b = tmp;
        System.out.println("Setelah ditukar, : "+a+" dan : "+ b);

    }
    public static <T> void Tukar(T[] A, T[] B){
        T Tmp = A[0];
        A[0] = B[0];
        B[0] = Tmp;

    }

    public static <T extends Kucing> double Bobot2(T a,T b){
        return a.getBobot() + b.getBobot();
    }
}
public class Generic {
    public static void main(String[] args) throws Exception {
        // I) Generic pada Class
        Anggora K1 = new Anggora("Meong", 5.2);
        Kembangtelon K2 = new Kembangtelon("Oscar", 6.9);
        Anjing A1 = new Anjing("guguk");
        Burung B1 = new Burung("citcit");
        Datum <Anabul> Datum1= new Datum <>();



        Datum1.setIsi(K1);
        System.out.println("isi Datum 1 : "+ Datum1.getIsi());
        Datum1.setIsi(K2);
        System.out.println("isi Datum 1 : "+ Datum1.getIsi());
        Datum1.setIsi(A1);
        System.out.println("isi Datum 1 : "+ Datum1.getIsi());
        Datum1.setIsi(B1);
        System.out.println("isi Datum 1 : "+ Datum1.getIsi());


        // II)Generic pada Operator
        //3.b
        int a = 1,b= 999999;
        String s1 = "Hidup",s2 = "KKKOAJKDODAJIOPJIOUGIAGIA";
        Burung B2 = new Burung("J1"),B3 = new Burung("J10");

        OperatorGenerik <Integer> OP1 = new OperatorGenerik<>(); 
        OperatorGenerik <String> OP2 = new OperatorGenerik<>(); 
        OperatorGenerik <Anabul> OP3 = new OperatorGenerik<>(); 


        OP1.Tukar(a, b);
        OP2.Tukar(s1, s2);
        OP2.Tukar(A1, B1);

        //3.c
        System.out.println("Bobot K1 dan K2 : "+OP1.Bobot2(K1, K2));

    }
}

/*
NIM     : 24060124130072
Nama    : Ali Maskan Ferry Purwanto
Tanggal : Selasa/21-04-2026
*/

//No 2
class Mahasiswa{
    //Atribut
    private String Nama;
    private String NIM;
    private String Prodi;

    //Konstruktor

    Mahasiswa(){
      this.Nama = "n/a";
      this.NIM = "-999";
      this.Prodi = "n/a";
    }
    Mahasiswa(String Nama){
        this.Nama = Nama;
        this.NIM = Integer.toString((int)(Math.random() * (400004 - 100004 + 1)) + 100004);
    }

    Mahasiswa(String NIM,String Nama,String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    Mahasiswa(Mahasiswa Mahasiswa){
        this.NIM = Mahasiswa.NIM;
        this.Nama = Mahasiswa.Nama;
        this.Prodi = Mahasiswa.Prodi;
    }
 


    //No 2 a.
    //setter
    public void setNama(String Nama){
        this.Nama = Nama;
    }
       public void setProgramStudi(){
        this.Prodi = "Kosong";
    }

    public void setProgramStudi(String prodi){
        this.Prodi = prodi;
    }

    public void setProgramStudi(Mahasiswa mahasiswa){
        this.Prodi = mahasiswa.Prodi;
    }


    //getter
    public String getNama(){
        return this.Nama;
    }

    public String getNIM(){
        return this.NIM;
    }
    public String getProdi(){
        return this.Prodi;
    }

    public void info(){
   
        System.out.println("Nama : " + getNama());
        System.out.println("NIM : " + getNIM());
        System.out.println("Prodi : " + getProdi());
    }
}
class A{int ubah(String X) { return Integer.parseInt(X);}}
class T{String ubah(int X) {return Integer.toString(X);}}
public class App {
    public static void main(String[] args) throws Exception {
        int a = 65;
        char B = (char)a;
        double C = (double)a;
        int L = (int)C;
        String X = "1234";
        String Y = "5678";
        int balikInt = Integer.parseInt(X);
        double balikDouble = Double.parseDouble(X);
        // no 1 a
        System.out.println(B);
        System.out.println(C);
        System.out.println(L);
        System.out.println(balikInt);
        System.out.println(balikDouble);

        //no 1 b
        System.out.println("sebelum = "+a);
        System.out.println("sesudah = "+C);
        int p = (int)C;
        System.out.println("di kembalikan = "+p);


        //no 1 c
        String S = X + Y;
        System.out.println("S : "+ S);
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Z : "+Z);

        //no 1 d
        String P = "12.34",Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R : "+R);
        System.out.println("D : "+D);

        //no 1 e
       A CCC = new A();
        int A = CCC.ubah(X);
       System.out.println("A : "+A);
    
       //no 1 f
       T KKK = new T();
        String T = KKK.ubah(A);
       System.out.println("T :" +T);
       

       //No 2 b
       Mahasiswa Agus = new Mahasiswa("Agus");
       Mahasiswa Budi = new Mahasiswa("Budi");
       Mahasiswa Carles = new Mahasiswa("Carles");

       Agus.setProgramStudi();
       Budi.setProgramStudi("Filsafat Informatika");
       Carles.setProgramStudi(Budi);

       Agus.info();
       Budi.info();
       Carles.info();

       //no 2 c
       Mahasiswa idk = new Mahasiswa();

       idk.info();


       //no 2 d
       Mahasiswa Denis = new Mahasiswa("2413513","Denis","Teknik Bayangan");
       Denis.info();


       //no 2 e
       Mahasiswa Erlang = new Mahasiswa(Denis);

       Erlang.info();
    }
}

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
 


    //Method
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

abstract class Anabul {
    /*Atribut */
    private String Nama;

    //Konstruktor
    Anabul(String Nama){
        this.Nama = Nama;
    }

    //Abstract Method
    abstract void Gerak();
    abstract void Bersuara();
}

class Kucing extends Anabul{
    //Konstruktor
    Kucing(String Nama){
        super(Nama);
    }

    //Method
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

//No 4
 abstract class Civitasakademika{
    /*ATRIBUT */
        private String Nama;
    

    //Konstruktor
        Civitasakademika(String Nama){
            this.Nama = Nama;
        }

    //Method
        abstract String getNomor();
        String getNama(){
            return Nama;
        }

    }

class Dosen extends Civitasakademika{
    /*ATRIBUT */
    private String NIP;

    //Konstruktor
    Dosen(String Nama,String NIP){
        super(Nama);
        this.NIP = NIP;
    }

    //Method
    @Override
    public String getNomor() {
        return NIP;    
    }

}

class Mahasiswaa extends Civitasakademika{
    /*ATRIBUT */
    private String NIM;
    private Dosen DosenWali;

    //Konstruktor
    Mahasiswaa(String NIM,String Nama,Dosen DosenWali){
        super(Nama);
        this.DosenWali = DosenWali;
        this.NIM = NIM;
    }

    //Setter
    public void setWali(Dosen DosenWali){
        this.DosenWali = DosenWali;
    }
    //getter
    public String getDosenWali(){
        return DosenWali.getNama();
    }
    //Method
    @Override
    public String getNomor(){
        return this.NIM;
    }

    public void tampilDataMahasiswa(){
        System.out.println("NIM \t\t: " + getNomor());
        System.out.println("Nama \t\t: " + getNama());
        System.out.println("Dosen Wali \t: " + getDosenWali());
    }
}

//no 4 b
class Seminar{
    /*Atribut */
    Civitasakademika[] pesertas = new Civitasakademika[101];
    private int banyakpeserta;

    //Konstruktor
    Seminar(){
        banyakpeserta = 0;
    }

    //Method
    public int countPeserta(){
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika pengunjung){
        banyakpeserta++;
        this.pesertas[banyakpeserta] = pengunjung;
        
    }
    
    public void tampilPeserta(){
        if(this.banyakpeserta > 0){
            
            for(int i = 1;i<= banyakpeserta;i++){
                System.out.println(i + ")Nama : "+pesertas[i].getNama() + "\t|Nomor : "+pesertas[i].getNomor());
            }
        }
    }

    public int countMahasiswa(){
        int sum = 0;
        if(this.banyakpeserta != 0){
            for(int i = 1;i<=banyakpeserta;i++){
                if(pesertas[i] instanceof Mahasiswaa){
                    sum++;
                }
            }
        }

        return sum;
    }
}


class A{int ubah(String X) { return Integer.parseInt(X);}}
class T{String ubah(int X) {return Integer.toString(X);}}
public class Polimorfisme {
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



       //no 3
        Anabul Kitty = new Kucing("Kitty");
        Anabul Doggy = new Anjing("Doggy");
        Anabul Burung = new Burung("Johny");

        
        Kitty.Gerak();
        Kitty.Bersuara();

        Doggy.Gerak();
        Doggy.Bersuara();

        Burung.Gerak();
        Burung.Bersuara();


        //No 4 e
       Dosen D1 = new Dosen("Agus", "24020213");
        Dosen D2 = new Dosen("Budi", "13022112");
        Mahasiswaa M1 = new Mahasiswaa("1213124", "Zaenal", D1);
        Mahasiswaa M2 = new Mahasiswaa("23413474", "Yanto", D1);
        Mahasiswaa M3 = new Mahasiswaa("32787654", "Xavier", D2);
        Mahasiswaa M4 = new Mahasiswaa("42132421", "Wawan", D2);
        Mahasiswaa M5 = new Mahasiswaa("52131241", "Vio", D2);

        Seminar Bakti = new Seminar();

        //No 4 f
        System.out.println("Seminar Bakti diikuti oleh "+Bakti.countPeserta()+" Orang");
        Bakti.registrasi(M1);
        Bakti.registrasi(M2);
        Bakti.registrasi(M3);
        Bakti.registrasi(M4);
        Bakti.registrasi(M5);
        Bakti.registrasi(D1);
        Bakti.registrasi(D2);

        System.out.println("Seminar Bakti diikuti oleh "+Bakti.countPeserta()+" Orang");
     

        //No 4 g
        Bakti.tampilPeserta();


        //No 4 h
        System.out.println("Jumlah Mahasiswa yang ikut seminar Bakti : "+Bakti.countMahasiswa());

        //No 4 i
        System.out.println("Wali Lama Vio : "+M5.getDosenWali());
        M5.setWali(D1);
        System.out.println("Wali Baru Vio : "+M5.getDosenWali());

        //no 4 j
        M1.tampilDataMahasiswa();

       /*Renungan : Menurut saya cara kerja polimorp adalah mengubah parameter 
       atau keluaran dari fungsi/prosedur dari sebuah fungsi yang sudah ada. Polimorp juga 
       bisa digunakan untuk mengubah jenis data type dari suatu variable
       */
    }
}

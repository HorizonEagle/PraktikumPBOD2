public class Dosen {
    /*****************ATRIBUT*****************/

    private String nip;
    private String Nama;
    private String Prodi;


    //KONSTRUKTOR
    Dosen(){
        this.Nama = "0";
        this.nip = "0";
        this.Prodi = "0";
    }
    Dosen(String A,String B,String C){
        this.nip = A;
        this.Nama = B;
        this.Prodi = C;
    }



    String getNip(){
        return this.nip;
    }

    String getNama(){
        return this.Nama;
    }

    String getProdi(){
        return this.Prodi;
    }

    
    void infoDosen(){
        System.out.println("Nip = " + nip);
        System.out.println("Nama Dosen = " + Nama);
        System.out.println("Prodi = " + Prodi);
    }
}
public class MataKuliah {
    /*****************ATRIBUT*****************/

    private String idMatkul;
    private String nama;
    private int sks;
    private static int counter=0;

    //KONSTRUKTOR
    MataKuliah(){
        idMatkul = " ";
        nama = " ";
        sks = 0;
        counter++;
    }
    MataKuliah(String IDMatkul,String Nama,int sks){
        this.idMatkul = IDMatkul;
        this.nama = Nama;
        this.sks = sks;
        counter++;
    }
 
    //SELECTOR
    String getIdMatkul(){
        return idMatkul;
    }

    String getNama(){
        return nama;
    }

    int getSks(){
        return sks;
    }

    //MUTATOR
    void setIdMatkul(String IDMatkul){
        this.idMatkul = IDMatkul;
    }

    void setNama(String NamaMatkul){
        this.nama = NamaMatkul;
    }

    void setSks(int SKS){
        this.sks = SKS;
    }
}

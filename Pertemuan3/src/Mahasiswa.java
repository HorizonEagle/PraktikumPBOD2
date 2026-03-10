import java.util.ArrayList;
import java.util.Arrays;
public class Mahasiswa {
    /*****************ATRIBUT*****************/
    private String Nama;
    private String NIM;
    private String Prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan Kendaraan;


    //KONSTRUKTOR
    Mahasiswa(){
        Nama = "0";
        NIM = "0";
        Prodi = "0";
        listMatkul = new ArrayList<>();
    }

    Mahasiswa(String nama, String nim, String prodi){
        this.Nama = nama;
        this.NIM = nim;
        this.Prodi = prodi;
        listMatkul = new ArrayList<>();
    }


    //Selector
    String getNama(){
        return Nama;
    }

    String getNIM(){
        return NIM;
    }

    String getProdi(){
        return Prodi;
    }
   
    //Mutator
    void setNama(String Nama){
        this.Nama = Nama;
    }

    void setNIM(String NIM ){
        this.NIM = NIM;
    }

    void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    void setDosenWali(Dosen DW){
        this.dosenWali = DW;
    }

    void setKendaraan(Kendaraan kendaraan){
        this.Kendaraan = kendaraan;
    }

    //METHOD
    void addMatKul(MataKuliah Matkul){
        listMatkul.add(Matkul);
    }

    void printDetailMhs(){
        System.out.println("Nim = "+NIM);
        System.out.println("Nama = "+Nama);
        System.out.println("Prodi = "+Prodi);
        int i;
        for(i = 0;i<listMatkul.size();i++){
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println(dosenWali);
        System.out.println(Kendaraan);
    }

    int getJumlahSKS(){
        int total=0,i;
        for(i = 0;i<listMatkul.size();i++){
            total += listMatkul.get(i).getSks();
        }
        return total;
    }

    int getJumlahMatKul(){
        int total=0;
        total = listMatkul.size();
        return total;
    }

    void printMHS(){
        System.out.println(Nama);
        System.out.println(NIM);
        System.out.println(Prodi);
    }


    


}

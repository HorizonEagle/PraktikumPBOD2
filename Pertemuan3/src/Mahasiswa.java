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

    //METHOD
    void AddMatkul(MataKuliah Matkul){
        listMatkul.add(Matkul);
    }

    void PrintDetailMHS(){
        System.out.println("Nim = "+NIM);
        System.out.println("Nama = "+Nama);
        System.out.println("Prodi = "+Prodi);
        int i;
        for(i = 0;i<listMatkul.size();i++){
            System.out.println(listMatkul.get(i).getNama());
        }
    }


    


}

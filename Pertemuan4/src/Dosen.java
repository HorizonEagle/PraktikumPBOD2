import java.util.Date;

public abstract class Dosen extends Pegawai{
    /******Atribute******/
    private String Fakultas;

    //Konstruktor
    public Dosen(){}

    public Dosen(String NIP,String Nama,Date tanggalLahir,Date TMT,double GajiPokok,String Fakultas){
        super(NIP,Nama,tanggalLahir,TMT,GajiPokok);
        this.Fakultas = Fakultas;
    }

    //Mutator
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    //Selector
    public String getFakultas(){
        return Fakultas;
    }
    
}
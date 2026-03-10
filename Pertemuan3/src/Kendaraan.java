public class Kendaraan {
    /*****************ATRIBUT*****************/

    private String noPlat;
    private String Jenis;


    //KONSTRUKTOR
    Kendaraan(){
        noPlat = "0";
        Jenis = "0";
    }

    Kendaraan(String noPlat,String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    //Selector
    String getNoPlat(){
        return noPlat;
    }

    String getJenis(){
        return Jenis;
    }

    //Mutator
    void setnoPlat(String noP){
        this.noPlat = noP;
    }

    void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
}

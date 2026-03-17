import java.util.Date;
import java.util.Calendar;

public class Tendik extends Pegawai {
    /*Atribute*/
    private String Bidang;
    static private int BUP = 55;

    /*Method*/

    //Konstruktor
    public Tendik(){

    }

    public Tendik(String NIP,String Nama,Date tanggalLahir,Date TMT,double GajiPokok,String Bidang){
        super(NIP,Nama,tanggalLahir,TMT,GajiPokok);
        this.Bidang = Bidang;
    }

    //Mutator
    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    //Selector
    public String getBidang(){
        return Bidang;
    }

    public int getBUP(){
        return BUP;
    }

    //Menghitung tunjangan
    public double getTunjangan(){
        int[] masaKerja = getMasaKerja();
        return 0.01 * masaKerja[0] * getGajiPokok();
    }

    //Menghitung tanggal pensiun
    public Date getTanggalPensiun(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(getTanggalLahir());
        cal.add(Calendar.YEAR, BUP);
        //geser ke tanggal 1 bulan berikutnya
        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    //print info tendik
    @Override
    public void printInfo(){
        int[] masaKerja = getMasaKerja();
        double tunjangan = getTunjangan();

        System.out.println("NIP               : " + getNIP());
        System.out.println("Nama              : " + getNama());
        System.out.println("Tanggal Lahir     : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT               : " + formatTanggal(getTMT()));
        System.out.println("Jabatan           : Tenaga Kependidikan");
        System.out.println("Bidang            : " + Bidang);
        System.out.println("Masa Kerja        : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Tanggal Pensiun   : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok        : " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan         : 1% x " + masaKerja[0] + " x " + formatRupiah(getGajiPokok()) + " = " + formatRupiah(tunjangan));
    }

}
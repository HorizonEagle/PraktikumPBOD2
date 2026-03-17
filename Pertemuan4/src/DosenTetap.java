import java.util.Date;
import java.util.Calendar;

public class DosenTetap extends Dosen {
    /* Atribute*/
    private String NIDN;
    static private int BUP = 65; 

    /*****Method****/
    //Konstruktor
    DosenTetap(){
        
    }

    DosenTetap(String NIDN,String NIP,String Nama,Date tanggalLahir,Date TMT,double GajiPokok,String Fakultas){
        super(NIP,Nama,tanggalLahir,TMT,GajiPokok,Fakultas);
        this.NIDN = NIDN;
    }

    //Mutator
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    //Selector
    public String getNIDN(){
        return NIDN;
    }

    public int getBUP(){
        return BUP;
    }

    //Menghitung tunjangan
    public double getTunjangan(){
        int[] masaKerja = getMasaKerja();
        return 0.02 * masaKerja[0] * getGajiPokok();
    }

    //Menghitung tanggal pensiun: tanggal lahir + BUP, jatuh pada tanggal 1 bulan berikutnya
    public Date getTanggalPensiun(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(getTanggalLahir());
        cal.add(Calendar.YEAR, BUP);
        cal.add(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    //print dosen tetap
    @Override
    public void printInfo(){
        int[] masaKerja = getMasaKerja();
        double tunjangan = getTunjangan();

        System.out.println("NIP               : " + getNIP());
        System.out.println("NIDN              : " + NIDN);
        System.out.println("Nama              : " + getNama());
        System.out.println("Tanggal Lahir     : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT               : " + formatTanggal(getTMT()));
        System.out.println("Jabatan           : Dosen Tetap");
        System.out.println("Fakultas          : " + getFakultas());
        System.out.println("Masa Kerja        : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Tanggal Pensiun   : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok        : " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan         : 2% x " + masaKerja[0] + " x " + formatRupiah(getGajiPokok()) + " = " + formatRupiah(tunjangan));
    }

}
import java.util.Date;
import java.util.Calendar;

public class DosenTamu extends Dosen {
    /*Atribute */
    private String NIDK;
    private Date TanggalBerakhirKontrak;
    static private int BUP = 70; //BUP default dosen tamu (tidak dipakai utama, diganti kontrak)

    /*Method */

    //Konstruktor
    DosenTamu(){

    }

    DosenTamu(String NIDK,String NIP,String Nama,Date tanggalLahir,Date TMT,double GajiPokok,String Fakultas,Date TanggalBerakhirKontrak){
        super(NIP,Nama,tanggalLahir,TMT,GajiPokok,Fakultas);
        this.NIDK = NIDK;
        this.TanggalBerakhirKontrak = TanggalBerakhirKontrak;
    }

    //Mutator
    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public void setTanggalBerakhirKontrak(Date TanggalBerakhirKontrak){
        this.TanggalBerakhirKontrak = TanggalBerakhirKontrak;
    }

    //Selector
    public String getNIDK(){
        return NIDK;
    }

    public int getBUP(){
        return BUP;
    }

    public Date getTanggalBerakhirKontrak(){
        return TanggalBerakhirKontrak;
    }

    //Menghitung sisa masa kontrak dari sekarang hingga tanggal berakhir kontrak (dalam bulan)
    public int getSisaKontrakBulan(){
        Calendar sekarang = Calendar.getInstance();
        Calendar berakhir = Calendar.getInstance();
        berakhir.setTime(TanggalBerakhirKontrak);

        int tahun = berakhir.get(Calendar.YEAR) - sekarang.get(Calendar.YEAR);
        int bulan = berakhir.get(Calendar.MONTH) - sekarang.get(Calendar.MONTH);

        return (tahun * 12) + bulan;
    }

    //Menghitung tunjangan: 2,5% x gaji pokok
    public double getTunjangan(){
        return 0.025 * getGajiPokok();
    }

    //print info Dosen Tamu
    @Override
    public void printInfo(){
        int sisaKontrak = getSisaKontrakBulan();
        double tunjangan = getTunjangan();

        System.out.println("NIP               : " + getNIP());
        System.out.println("NIDK              : " + NIDK);
        System.out.println("Nama              : " + getNama());
        System.out.println("Tanggal Lahir     : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT               : " + formatTanggal(getTMT()));
        System.out.println("Jabatan           : Dosen Tamu");
        System.out.println("Fakultas          : " + getFakultas());
        System.out.println("Masa Kerja        : " + getMasaKerja()[0] + " tahun " + getMasaKerja()[1] + " bulan");
        System.out.println("Berakhir Kontrak  : " + formatTanggal(TanggalBerakhirKontrak) + " (" + sisaKontrak + " bulan lagi)");
        System.out.println("Gaji Pokok        : " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan         : 2,5% x " + formatRupiah(getGajiPokok()) + " = " + formatRupiah(tunjangan));
    }

}
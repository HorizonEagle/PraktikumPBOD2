import java.util.Date;
import java.util.Calendar;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Pegawai {
    //Atribut
    private String NIP;
    private String Nama;
    private Date TanggalLahir;
    private Date TMT;
    private double GajiPokok;

    //Konstruktor
    public Pegawai(){}

    public Pegawai(String NIP,String Nama,Date TanggalLahir,Date TMT,double Gaji){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok = Gaji;
    }

    /********Method*********/
    //Mutator
    //mengeset NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    //mengeset Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    //mengeset tgllahir
    public void setTanggalLahir(Date tglLahir){
        this.TanggalLahir = tglLahir;
    }

    public void setTMT(Date TMT){
        this.TMT = TMT;
    }

    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    //Selector
    //mengambil nilai NIP
    public String getNIP(){
        return NIP;
    }

    //mengambil nilai Nama
    public String getNama(){
        return Nama;
    }

    public Date getTanggalLahir(){
        return TanggalLahir;
    }

    public Date getTMT(){
        return TMT;
    }

    public double getGajiPokok(){
        return GajiPokok;
    }

    //Method abstract untuk mendapatkan tunjangan
    public abstract double getTunjangan();

    //mengembalikan nilai masa kerja dari TMT hingga sekarang
    //return array [tahun, bulan]
    public int[] getMasaKerja(){
        Calendar tmt = Calendar.getInstance();
        tmt.setTime(this.TMT);

        Calendar sekarang = Calendar.getInstance();

        int tahun = sekarang.get(Calendar.YEAR) - tmt.get(Calendar.YEAR);
        int bulan = sekarang.get(Calendar.MONTH) - tmt.get(Calendar.MONTH);

        if(bulan < 0){
            tahun--;
            bulan += 12;
        }

        return new int[]{tahun, bulan};
    }

    //buat format tgl
    public String formatTanggal(Date tanggal){
        String[] namaBulan = {
            "Januari","Februari","Maret","April","Mei","Juni",
            "Juli","Agustus","September","Oktober","November","Desember"
        };

        Calendar cal = Calendar.getInstance();
        cal.setTime(tanggal);

        int hari  = cal.get(Calendar.DAY_OF_MONTH);
        int bulan = cal.get(Calendar.MONTH);
        int tahun = cal.get(Calendar.YEAR);

        return hari + " " + namaBulan[bulan] + " " + tahun;
    }

    //Method untuk memformat angka menjadi format Rupiah
    public String formatRupiah(double nominal){
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        return nf.format(nominal);
    }

    //Method concrete printInfo() — ditimpa (override) di setiap subclass
    public void printInfo(){
        int[] masaKerja = getMasaKerja();
        System.out.println("NIP               : " + NIP);
        System.out.println("Nama              : " + Nama);
        System.out.println("Tanggal Lahir     : " + formatTanggal(TanggalLahir));
        System.out.println("TMT               : " + formatTanggal(TMT));
        System.out.println("Masa Kerja        : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Gaji Pokok        : " + formatRupiah(GajiPokok));
    }

}
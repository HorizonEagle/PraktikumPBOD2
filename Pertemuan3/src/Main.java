public class Main {
    public static void main(String[] args) {
        Dosen D1 = new Dosen();
        MataKuliah MK1 = new MataKuliah();
        Kendaraan K1 = new Kendaraan();
        Mahasiswa MHS1 = new Mahasiswa();

        MK1.setIdMatkul("1");
        MK1.setNama("ASA");

        MHS1.AddMatkul(MK1);

        MHS1.PrintDetailMHS();

    }
    
}

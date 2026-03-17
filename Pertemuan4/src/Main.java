import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        
        Calendar cal = Calendar.getInstance();

        //Dosen Tetap
        cal.set(1990, Calendar.MAY, 5);
        Date tglLahirDT = cal.getTime();

        cal.set(2015, Calendar.JANUARY, 1);
        Date tmtDT = cal.getTime();

        DosenTetap dosenTetap = new DosenTetap(
            "78647324",
            "9545647548",
            "Andi",
            tglLahirDT,
            tmtDT,
            5000000,
            "Fakultas Sains dan Matematika"
        );

        System.out.println("DOSEN TETAP =");
        dosenTetap.printInfo();

        System.out.println();

        //Dosen Tamu 
        cal.set(1985, Calendar.MARCH, 15);
        Date tglLahirDTamu = cal.getTime();

        cal.set(2023, Calendar.JUNE, 1);
        Date tmtDTamu = cal.getTime();

        cal.set(2026, Calendar.DECEMBER, 31);
        Date berakhirKontrak = cal.getTime();

        DosenTamu dosenTamu = new DosenTamu(
            "NIDK001",
            "1234567890",
            "Budi Santoso",
            tglLahirDTamu,
            tmtDTamu,
            6000000,
            "Fakultas Teknik",
            berakhirKontrak
        );

        System.out.println("DOSEN TAMU = ");
        dosenTamu.printInfo();

        System.out.println();

        //Tendik
        cal.set(1988, Calendar.AUGUST, 20);
        Date tglLahirTendik = cal.getTime();

        cal.set(2018, Calendar.APRIL, 1);
        Date tmtTendik = cal.getTime();

        Tendik tendik = new Tendik(
            "9876543210",
            "Siti Rahayu",
            tglLahirTendik,
            tmtTendik,
            4000000,
            "Akademik"
        );

        System.out.println("TENDIK =");
        tendik.printInfo();

    }
}
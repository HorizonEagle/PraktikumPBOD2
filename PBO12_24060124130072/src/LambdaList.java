import java.util.*;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();

        mahasiswaList.add("Andi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Diddy");

        //lambda sbg parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}

import java.util.*;
public class LambdaMap {
    public static void main(String[] args) {
        Map<String,String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("1", "Andi");
        mahasiswaMap.put("2", "Bambang");
        mahasiswaMap.put("3", "Cici");
        mahasiswaMap.put("4", "Diddy");

        mahasiswaMap.forEach((Nim,Nama) -> System.out.println(Nim + "|"+Nama));
    }
}


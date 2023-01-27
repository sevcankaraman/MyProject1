package bastansonatekrar.ifstatement;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> sehir=new ArrayList<>();
        //Example=  verilen bir string listteki tüm elemanların toplam karakter sayılarını bulan kodu yazınız.

        sehir.add("Miami");
        sehir.add("Istanbul");
        sehir.add("Kayseri");
        sehir.add("Almaty");

        //1.yol
        int toplam=0;
        for (String w:sehir ) {
            toplam=toplam+w.length();

        }
        System.out.println(toplam);

        //2.yol
        int sum=0;
        for(int i=0 ; i<sehir.size(); i++){
            sum=sum+sehir.get(i).length();
        }
        System.out.println(sum);

    }
}

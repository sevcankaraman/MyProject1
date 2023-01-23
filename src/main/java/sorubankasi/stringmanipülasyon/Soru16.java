package sorubankasi.stringmanipülasyon;

public class Soru16 {
    public static void main(String[] args) {
        /*
        Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
              Not: İkinci isim kapsam dışındadır.
              Örnek: Tom Hanks ==> TH, Mary Star ==> MS
         */

        String isim="Sevcan Karaman";
        String ilkHarf=isim.substring(0,1);
        String soyadIlkHarf=isim.split(" ")[1].substring(0,1);
        System.out.println(ilkHarf+soyadIlkHarf);

    }
}

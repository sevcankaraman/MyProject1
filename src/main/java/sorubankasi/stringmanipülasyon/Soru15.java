package sorubankasi.stringmanipülasyon;

public class Soru15 {
    public static void main(String[] args) {
      /*  String gomlekFiyat = ‘$12.99’;
        String kitapFiyat = ‘$35.99’;
        Gomlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız
        */
        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";

        String s=gomlekFiyat.replaceAll("[$.]","");
        String k=kitapFiyat.replaceAll("[$.]","");

        double x= Double.valueOf(s);
        double y= Double.valueOf(k);

        System.out.println("toplam fıyat "+ (x+y)/100);


    }
}

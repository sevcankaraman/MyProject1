package sorubankasi.stringmanipülasyon;

public class Soru17 {
    public static void main(String[] args) {
       // Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.

        String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
        int toplamKarakterSayisi=s.length();
        int noktalamaIsaretleriDisindakilerinSayisi=s.replaceAll("\\p{Punct}","").length();
        int noktalamaIsaretlerininSayisi=toplamKarakterSayisi-noktalamaIsaretleriDisindakilerinSayisi;
        System.out.println(noktalamaIsaretlerininSayisi);
    }
}

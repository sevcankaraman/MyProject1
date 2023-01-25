package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class ScannerSorusu01 {
    public static void main(String[] args) {

        /*  Problem Tanımı
            Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
               a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
    Örnek Ekran Çıktısı
    a sayısını giriniz: 5
    b sayısını giriniz: 3
    c sayısını giriniz: 1
sonuç : 5.333333333333333
*/

        Scanner scanner=new Scanner(System.in);
        System.out.print("a sayısnını giriniz : ");
        int a=scanner.nextInt();
        System.out.print("b sayısnını giriniz : ");
        int b=scanner.nextInt();
        System.out.print("c sayısnını giriniz : ");
        int c=scanner.nextInt();
        double sonuc=((a*a)-(b*b))/(3*c)   ;
        System.out.println("işleminizn sonucu :"+sonuc);
    }
}

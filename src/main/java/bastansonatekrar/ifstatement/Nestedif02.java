package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class Nestedif02 {
    public static void main(String[] args) {
          /*
           Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

           Eger calisan kadinsa ;
           60 yasindan buyukse “Emekli Olabilir “yazdirin"

           Eger calisan erkek ise 65 ;
           yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz

    */

        Scanner input = new Scanner(System.in);
        System.out.println("cinsiyetinizi  giriniz..");
        String cinsiyet = input.next();

        System.out.println("yasinizi giriniz..");
        int yas = input.nextInt();

        if (yas<0 || yas>120) {
            System.out.println("lütfen 0-120 arasında bır sayı gırınız");

        }else if (cinsiyet.equalsIgnoreCase("kadın")) {

            if (yas > 60) {
                System.out.println("emekli olabılır");
            } else {
                System.out.println("çalışmalı");

            }
        }else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            if (yas > 65) {
                System.out.println("emekli olabilir");
            } else {
                System.out.println("calışmalı");
            }
        }else {
                System.out.println("tanımlı değil");

                }
    }
}
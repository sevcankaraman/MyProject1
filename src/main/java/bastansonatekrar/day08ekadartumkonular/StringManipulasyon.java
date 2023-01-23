package bastansonatekrar.day08ekadartumkonular;

import java.util.Scanner;

public class StringManipulasyon {

    //kullanıcıdan tek seferde alacagınız 2 kelımelık ad soyad 2 ayrı kelımeye ayırınız
    //ad ayrı soyad ayrı sekılde ekrana yazdırınız

    // örnek : " ali      can "
    // Ad: Ali
    // Soyad: Can

    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);
        System.out.println("adınızı ve soyadınız giriniz...");
        String[] name= input.nextLine().split("");

        int kullanimsayisi=0;
        String sonuc="";

        for (String w:name
             ) { kullanimsayisi=0;
            for (String u:name
                 ) {
                if (w.equals(u)){
                    kullanimsayisi++;
                }

            }
            if(!sonuc.contains(w)){
                sonuc+=w+kullanimsayisi+" ";
            }

        }
        System.out.println("sonuc  : "+sonuc);








    }

}

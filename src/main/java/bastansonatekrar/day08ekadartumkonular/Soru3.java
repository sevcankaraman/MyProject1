package bastansonatekrar.day08ekadartumkonular;

import java.util.Scanner;

public class Soru3 {
    /*
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
                Ipucu : Vucut
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
                ORNEK:
        INPUT      : Kilo: 71
        Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
                */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("kilonuzu giriniz : ");
        double kilo=scan.nextDouble();
        System.out.print("boyunuzu cm  giriniz : ");
        double boy=scan.nextDouble();
        System.out.println(boy /= 100);

        double vki=kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz :"+vki);
    }



    }


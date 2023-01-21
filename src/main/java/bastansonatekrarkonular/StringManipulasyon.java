package bastansonatekrarkonular;

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
        String[] name= input.nextLine().replaceAll("[^a-zA-Z]"," ").trim().split("");








    }

}

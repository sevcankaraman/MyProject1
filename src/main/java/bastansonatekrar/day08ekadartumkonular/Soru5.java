package bastansonatekrar.day08ekadartumkonular;

import java.util.Scanner;

public class Soru5 {
    //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("ıkı sayı gırınız");
        double ilkSayi=input.nextDouble();
        double ikinciSayi=input.nextDouble();

        System.out.println(ilkSayi+ikinciSayi);
        System.out.println(ilkSayi-ikinciSayi);
        System.out.println(ilkSayi*ikinciSayi);
        System.out.println(ilkSayi/ikinciSayi);



    }
}
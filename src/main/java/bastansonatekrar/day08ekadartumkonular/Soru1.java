package bastansonatekrar.day08ekadartumkonular;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {


    /*  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini
        bulunuz
*
*   Ex :
*   input  : 12345
*   output : 12

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = scan.nextInt();


        int ilkIki = number / 1000;
        int sonIki = number % 100;

        System.out.println("ilkIki = " + ilkIki);
        System.out.println("sonIki = " + sonIki);

        int ilkIkiSayiToplam = ilkIki / 10 + ilkIki % 10;
        System.out.println("ilkIkiSayiToplam = " + ilkIkiSayiToplam);

        int sonIkiSayiToplam = sonIki / 10 + sonIki % 10;
        System.out.println("sonIkiSayiToplam = " + sonIkiSayiToplam);

        System.out.println(sonIkiSayiToplam + ilkIkiSayiToplam);


    }
}
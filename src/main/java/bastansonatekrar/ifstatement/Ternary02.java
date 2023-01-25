package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int num=input.nextInt();
        System.out.println("***ternary ile çözümü***");

        String result=(num>=0) ? (num<10 ? "rakam" : "pozitif sayı ") : ("negatif sayi");
        System.out.println(result);

        System.out.println("***if ile çözümü****");

        if (num>=0){
            if (num<10){
            System.out.println("rakam");
        }else  System.out.println("pozitif");

        }else System.out.println("negatif");

            }
        }





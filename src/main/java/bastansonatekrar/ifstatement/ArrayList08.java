package bastansonatekrar.ifstatement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList08 {

    /* SAYI TAHMIN OYUNU
     Oyuncudan 1-10 arasi bir sayi isteyiniz
     Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
     Yoksa verdigi sayiyi listenize ekleyiniz.
             Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
            [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
             [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
             [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Oyunumuza hos geldiniz...");
        System.out.println("Oyunu sonlandirmak icin Q ya basiniz...");

        List<String> numsList = new ArrayList<>();
        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");

        int counter=0;
        String num="";

        do {
            System.out.println("lütfen 1-10 arasında bir sayı giriniz...");
            num=input.next();
            
            if (num.equalsIgnoreCase("Q")){
                break;
            } else if (numsList.contains(num)) {
                numsList.set(numsList.indexOf(num),"BINGO");
                counter++;
            }else{
                numsList.add(num);
            }

        }while (counter!=numsList.size());
        if (num.equalsIgnoreCase("Q")){
            System.out.println("kazandınız");

        }else{
            System.out.println("kendi isteğinizle cıktınız, tekrar bekleriz");
        }
        System.out.println(" final sonucu "+ numsList);

    }
}
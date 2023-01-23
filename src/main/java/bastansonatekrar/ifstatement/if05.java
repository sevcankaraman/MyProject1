package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class if05 {
    public static void main(String[] args) {

        //example 3) verilen bir sayının pozitif negatif veya nötr
        // oldugunu kontrol eden kodu yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz...");
        int sayi=scan.nextInt();

        if (sayi>0){
            System.out.println( "pozitf");
        } else if (sayi<0) {
            System.out.println("negatif");

        }else {
            System.out.println("nötr");
        }


    }
}

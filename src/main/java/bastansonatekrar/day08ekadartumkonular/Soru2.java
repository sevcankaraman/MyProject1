package bastansonatekrar.day08ekadartumkonular;

import java.util.Scanner;

public class Soru2 {
    /*
     * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("vize 1 notunuzu gırınız");
        double vize1= input.nextDouble();
        System.out.println("vize 2 notunuzu giriniz");
        double vize2=input.nextDouble();
        System.out.println("final notunuzu giriniz");
        double finalNotu=input.nextDouble();

        double gecmeNotu=(vize1+vize2)/2*0.3+(finalNotu*0.7);
        System.out.println(gecmeNotu);






    }

}
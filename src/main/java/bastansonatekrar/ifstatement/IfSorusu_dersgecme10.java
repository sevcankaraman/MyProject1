package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class IfSorusu_dersgecme10 {
    public static void main(String[] args) {

        /*
         * Kullanıcıdan vize ve final notlarını alınız. Kullanıcın istediği oranlarda
         * vize ve final yüzdeleri not ile not ortalamasını hesaplayıp not ortalamasını
         * yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
         * "Malesef dersten kaldınız..." yazdırınız
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.vize notunuzu giriniz : ");
        int v1=scanner.nextInt();
        System.out.println("2.vize notunuzu giriniz : ");
        int v2=scanner.nextInt();
        System.out.println("final notunuzu giriniz : ");
        int f=scanner.nextInt();
        System.out.println("vize hesaplama oranını gırınız");
        double vO=scanner.nextDouble();
        System.out.println("final hesaplama oranını giriniz");
        double fO=scanner.nextDouble();

        double ortalama=((v1+v2)/2*vO/100)+(f*fO/100);
        if (ortalama>50){
            System.out.println("tebrikler dersi basarı ile gectiniz  "+ ortalama );
        }else{
            System.out.println("malesef dersten kaldınız.. :((");
        }


    }
}

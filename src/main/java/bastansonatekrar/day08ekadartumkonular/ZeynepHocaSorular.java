package bastansonatekrar.day08ekadartumkonular;

import java.util.Scanner;

public class ZeynepHocaSorular {

    public static void main(String[] args) {
    //soru1 :
        System.out.println("\"Java\"ile hayat cok \"afilli\"");

    //soru2 :
        System.out.println("\"Basarı\" gayrete \n'aşıktır' \n\n\n\tTechProEd ile java cok kolay...");

    //soru3:
        System.out.println("\"Hello\",\"World \\ / \"");

    //soru4:
        int x = 12345;
        int birler = x % 10; //5
        int onlar = x / 10 % 10; //4
        int yuzler = x / 100 % 10; //3
        int binler = x / 1000 % 10; //2
        int onbinler = x / 10000;
        System.out.println(onbinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler + "\n");

    //soru5:
        /*   Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */


        int sayi=853;
        int bir=sayi%10;
        int on=sayi/10 % 10;
        int yuz=sayi/ 100;
        System.out.println("Girdiginiz sayinin birler basamagi : "+bir+
                           "\nGirdiginiz sayinin onlar basamagi : "+on+
                           "\nGirdiginiz sayinin yuzler basamagi :"+yuz );


    //soru6:
        /*  Problem Tanımı

            Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.

           Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
           120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
           Örnek Ekran Çıktısı
           Mesafeyi giriniz: 400
           Hızı giriniz: 100
           Süre 4 saattir.


*/
        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi giriniz");
        double mesafe=input.nextDouble();
        System.out.println("Hızı Giriniz");
        double hiz= input.nextDouble();

        double sure=0;

       sure=mesafe/hiz;
       System.out.println(sure);





    }}

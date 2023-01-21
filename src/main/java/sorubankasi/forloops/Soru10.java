package sorubankasi.forloops;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("baslangıc degerını gırınız");
        int baslangic= scan.nextInt();
        System.out.println("bitis degerini giriniz");
        int bitis=scan.nextInt();

        int carpim = 1;
        int toplam = 0;
        if(baslangic<=bitis) {
            for(int i=baslangic; i<=bitis; i++) {
                toplam = toplam + i;
            }
        } else {
            for(int i=baslangic; i>=bitis; i--) {
                carpim = carpim * i;
            }
        }
        System.out.print(carpim);
        System.out.println(toplam);

    }
}

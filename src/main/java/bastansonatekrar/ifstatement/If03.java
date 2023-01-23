package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class If03 {

    //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran
    //           kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu yaziniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz...");
        char harf=scan.next().charAt(0);

        if (harf>='A'&& harf<='Z'){
            System.out.println("büyük harf...");

        } else if (harf>='a'&& harf<='z') {
            System.out.println("kucuk harf...");

        }else {
            System.out.println("harf değil...");
        }
    }
}

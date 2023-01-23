package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class IfSoru8_Ekstra {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("ehliyetiniz var ise  1 yoksa 0 yaziniz ");
        int ehliyet=scan.nextInt();
        System.out.print("hizinizi giriniz : ");
        int hiz=scan.nextInt();

        if (ehliyet==1){
            if (hiz<0){
                System.out.println("hatalı veri girdiniz");
            }else if (hiz>54 && hiz<75) {
                System.out.println("cezanız 100 dolar");
            } else if (hiz>75 && hiz<85) {
                System.out.println("cezanız 150 dolar");
            }else if (hiz>85 && hiz<95){
                System.out.println("cezanız 320 dolardır");
            } else if (hiz>95) {
                System.out.println("cezanız 500 dolardır");
            }else {
                System.out.println("hız sınırında seyehat ediyorsunuz hayırlı yolculuklar...");
        }
        } else if (ehliyet==0) {
           if (hiz>54 && hiz<75){
               System.out.println("ceza 300 dolar");
           } else if (hiz>75 && hiz<85) {
               System.out.println("ceza 350 dolar");
           }else if (hiz>85 && hiz<95){
               System.out.println("cezanız 520 dolardır");
           } else if (hiz>95) {
               System.out.println("cezanız 700 dolardır");
           }else {
               System.out.println("ehliyetsız kullanımdan dolayı cezanız 200dolar...");

           }

        }else{
            System.out.println("lütfen gecerli bir değer giriniz"       );
        }

    }
}

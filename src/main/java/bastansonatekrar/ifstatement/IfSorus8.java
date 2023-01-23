package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class IfSorus8 {
    public static void main(String[] args) {

        /*
           Kulanıcıdan aracının hızını alınız
           Trafik cezasının değerini hesaplayın.
           45 hız sınırıdır.
           Eğer hızınız 55-74 arasında ise:
           Ceza 100 $'dır.
           Eğer hızınız 75 - 84 arasında ise:
           Ceza 150 $'dır.
           Eğer hızınız 85 -94 arasında ise:
           Ceza 320 $'dır.
           Eğer hızınız 94'den daha fazla ise:
           Ceza 500 $'dır.
           ve ayrıca,
           Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
 Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
Örn;
currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;
sonuç 320 olmalıdır.
currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;
sonuç 300 olmalıdır.
*/

                Scanner scan =new Scanner(System.in);
                System.out.print("hizinizi giriniz : ");
                int hiz=scan.nextInt();
                System.out.print("ehliyetiniz var ise  1 yoksa 0 yaziniz ");
                int ehliyet=scan.nextInt();

                if (ehliyet==1) {
                    if (hiz>54 && hiz<75) {
                        System.out.println("cezanız 100 dolar");
                    } else if (hiz>75 && hiz<84) {
                        System.out.println("cezanız 150 dolar");
                    }else if (hiz>85 && hiz<94){
                        System.out.println("cezanız 320 dolardır");
                    } else if (hiz>95) {
                        System.out.println("cezanız 500 dolardır");
                    }

                }else {
                     if (hiz>54 && hiz<75) {
                        System.out.println("cezanız 300 dolar");
                    } else if (hiz>75 && hiz<84) {
                        System.out.println("cezanız 350 dolar");
                    }else if (hiz>85 && hiz<94){
                        System.out.println("cezanız 620 dolardır");
                    } else if (hiz>95) {
                        System.out.println("cezanız 800 dolardır");
                    }else{
                         System.out.println("ceza ehliyet 300 dolar");
                     }
                }
                }
}

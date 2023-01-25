package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class DoWhileLoop02 {
     /*
                Gecerli Username="admin" ve Password="pwd123" dur.
                Kullanicidan username ve password'u alin.
                Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
                Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
                Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
         */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int counter=0;

        do {
            if (counter==4){
                System.out.println("hesabınız bloke olmustur");
                break;
            }
            System.out.println("username giriniz");
            String username=input.next();

            System.out.println("passwordu giriniz");
            String password= input.next();

            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("hesabınıza hosgeldınız");
                break;

            }
            counter++;


        }while(true);

    }
}

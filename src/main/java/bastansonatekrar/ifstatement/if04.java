package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class if04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz...");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("çift");
        }else{
            System.out.println("tek");

        }
    }
}

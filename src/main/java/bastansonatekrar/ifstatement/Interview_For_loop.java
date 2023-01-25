package bastansonatekrar.ifstatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Interview_For_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 100 de küçük bir tamsayı girin");
        int sayi = input.nextInt();

        for (int i = sayi; sayi > 101; i++) {
            System.out.println(sayi);


            if (sayi % 3 == 0) {
                System.out.println("Java");
            }
            if (sayi % 5 == 0) {
                System.out.println("Güzeldir");
            }
            if (sayi % 3 == 0 && sayi % 5 == 0) {
                System.out.println("java Güzeldir");
            }

        }
    }

}
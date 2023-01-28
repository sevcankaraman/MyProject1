package bastansonatekrar.ifstatement;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayList06 {
    public static void main(String[] args) {
        //Example 2: Musteriden urun ismini aliniz
        //           Musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //           Musterinin ismini verdigi urun listede yoksa "Out of stock" yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sistemimize hosgeldiniz...");
        System.out.println("Urun aramayi sonlandirmak icin Q'ya basiniz...");

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("İpad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");

        do {
            System.out.println("aradıgınız urunun ismini giriniz");
            String p = input.nextLine().toLowerCase();

            if (p.equalsIgnoreCase("Q")) {
                break;
            } else if (products.contains(p)) {
                System.out.println(p + " ürün stoktakta var ");
            } else {
                System.out.println(p + " ürün stokta yok");
            }
            }while (true) ;
                System.out.println(" sitemizi kullandıgınız için tesekkür eder, yine bekleriz..");

            }
}
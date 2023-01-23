package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class Ternary01 {//Example 1: Kullanicidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan) sayiyi yazdiriniz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz...");
        double a= input.nextDouble();
        double b= input.nextDouble();

        //1.yol

        if (a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2.yol : ternary

       double result= a<b ? a:b;
        System.out.println(result);

        //example : 2 sayının işareti aynı ise bu sayıları carpan
        //işaretleri farklı ise "farklı işaretli sayıları carpamıyorum"mesajı veren kodu yazınız

        int m=5;
        int n=6;








    }
}
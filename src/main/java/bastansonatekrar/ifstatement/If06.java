package bastansonatekrar.ifstatement;

import java.util.Scanner;

public class If06 {
    public static void main(String[] args) {

        //example 1: gun sayısını verdiğinizde gun ismini yazan kodu yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bır gun sayısı gırınız..");
        int gun=input.nextInt();

        if (gun==1){
            System.out.println("pazar");
        }
        else if (gun==2){
            System.out.println("pazartesi");
        }
        else if (gun==3){
            System.out.println("salı");
        }
        else if (gun==4){
            System.out.println("carsamba");
        }
        else if (gun==5){
            System.out.println("persembe");
        }
        else if (gun==6){
            System.out.println("cuma");
        }
        else if (gun==7 ){
            System.out.println("cumartesi");
        }else {
            System.out.println("hatalı giriş yaptınız lutfen 1 ile 7 arasında bır sayı gırınız");
        }


    }
}

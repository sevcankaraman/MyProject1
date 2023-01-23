package bastansonatekrar.day08ekadartumkonular;

public class StringManipulasyon2 {
    public static void main(String[] args) {
        String s="Learn java earn money 123";

        String s1=s.replace("earn","****");
        System.out.println(s1);

        String s2=s.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(s2);

        //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
        //             "   Ali Can   "     ==>      "Ali Can"

        String a="                 Sevcan Karaman      ";
        System.out.println(a);
        String a2=a.trim();
        System.out.println(a2);

       // example 2:
        //örn: "Ali Can"=AC

        String name="   ali cAN";
        char name2=name.trim().toUpperCase().charAt(0);
        System.out.print(name2);
        char name3=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(name3);

        //example 6: bir String de  a,e,i characterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırın
        //           "Java is easy to learn"==>1+5+8=14

        String str="Java is easy to learn";
        int indeksA=str.indexOf('a');//1
        System.out.println(indeksA);
        int indeksE=str.indexOf('e');//5
        System.out.println(indeksE);
        int indeksI=str.indexOf('i');//8
        System.out.println(indeksI);

        System.out.println("indeksler Toplamı = " + (indeksA+indeksE+indeksI));





    }
}

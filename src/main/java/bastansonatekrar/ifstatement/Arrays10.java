package bastansonatekrar.ifstatement;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays10 {
    //example 1: String Array elemanlarının uzunluklarına göre kucukten buyuge sıralayınz.
    // //        ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]
    public static void main(String[] args) {


        String arr[] = {"Michael", "Ajda", "Thomas", "Tom"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));


        //Example 2: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
//          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas","Cüneyt" "Ajda", "Tom"]

        String brr[]={"Michael", "Ajda", "Thomas", "Tom","Cuneyt"};
        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Example 3://Example 3: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        ////           Ayni character sayisinda olanlari da alfabetik siraya koyunuz.

        String crr[]={ "Michael", "Ajda", "Reyhane", "Gabriel","Thomas", "Tom", "Ali", "Cin","Cuneyt", "Cem" };
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));









    }
}
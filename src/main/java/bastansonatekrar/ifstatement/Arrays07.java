package bastansonatekrar.ifstatement;

import java.util.Arrays;

public class Arrays07 {

    public static void main(String[] args) {

        //Example 2: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //           a  - e - i - o - u - A - E - I - O - U
        // 1.yol
        //replaceAll methodu ile ;

        String s="java brings you money";
        int sessizHarfler=s.replaceAll("[^aeiouAEIOU]","").length();
                System.out.println(sessizHarfler);

        //2.yol:

        String harf[]=s.split("");
        System.out.println(Arrays.toString(harf));

        int counter=0;
        for (String w:harf ) {
            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }

        }
        System.out.println(counter);

    }
}

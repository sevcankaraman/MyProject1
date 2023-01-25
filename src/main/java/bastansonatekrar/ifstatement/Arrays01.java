package bastansonatekrar.ifstatement;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String arr []=new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].length()+arr[arr.length-1].length());

        int toplamkaraktersayisi=0;
        for (int i = 0; i < arr.length; i++) {
            toplamkaraktersayisi=toplamkaraktersayisi+arr[i].length();
            
            
        }
        System.out.println("toplamkaraktersayisi = " + toplamkaraktersayisi);

        System.out.println();

        for (String w:arr
             ) {
            toplamkaraktersayisi=toplamkaraktersayisi+w.length();
            
        }
        System.out.println("toplamkaraktersayisi = " + toplamkaraktersayisi);

    }
    
}

package bastansonatekrar.ifstatement;

import java.util.Arrays;

public class MultiDimensionalArray03 {
    public static void main(String[] args) {
        //Example 1: Bir multi-dimensional array olusturunuz ve bir dimensional'li array donusturunuz.
        //           [ [2, 5], [4, 7, 11] ] ==> [ 2, 5, 4, 7, 11 ]


        int a[][] = { {2, 5}, {4, 7, 11} };
        int toplamEleman=0;
        for (int [] w:a ) {
            toplamEleman=toplamEleman+ w.length;
        }

        int b[]=new int[toplamEleman];
        int idx=0;

        for (int [] w:a ) {
            for (int k:w ) {
                b[idx]=k;
                idx++;

            }

        }
        System.out.println(Arrays.toString(b));



    }
}

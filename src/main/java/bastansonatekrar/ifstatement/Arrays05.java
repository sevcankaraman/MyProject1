package bastansonatekrar.ifstatement;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //bir arrayı buyukten kucuge sıralayınız

        int arr[]={2,11,0,23,7};
        Arrays.sort(arr);
        for (int i = 4; i >=0 ; i--) {
            System.out.print(arr[i]+" ");

        }

    }
}

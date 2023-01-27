package bastansonatekrar.ifstatement;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {
    //Example 2: Bir Integer List'teki 7 haric tum elemanlarin degerlerini 3 artiriniz

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

        System.out.println(nums);

        for (int i = 0; i < nums.size(); i++) {
           int eleman= nums.get(i);
           if (eleman==7){
               continue;
           }
           nums.set(i,eleman+3);
        }
        System.out.println(nums);


    }
}
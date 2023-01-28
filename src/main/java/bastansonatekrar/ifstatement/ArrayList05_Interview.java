package bastansonatekrar.ifstatement;

import java.util.ArrayList;
import java.util.List;

public class ArrayList05_Interview {
    public static void main(String[] args) {

        //******************INTERWIEW QUESTIONS**********************
        //Example 1: Verilen bir list'teki elemanlari tekrarsiz olarak yazdiriniz
        //          [2,3,2,2,3,5]==>[2,3,5]

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList=new ArrayList<>();

        for (Integer w : myList ) {
            if (!newList.contains(w)){
                newList.add(w);
            }

        }
        System.out.println(newList);

        }



    }


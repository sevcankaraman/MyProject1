package bastansonatekrar.ifstatement;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example 2: Maas list i olusturunuz ve maaslara yuzde 20 zam yapınız

        List<Double> salary=new ArrayList<>();

        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

        int idx=0;

        for (Double w :salary ) {
            salary.set(idx,w*1.20);
            idx++;

        }
        System.out.println(salary);

        for (int i = 0; i < salary.size(); i++) {
            salary.set(i, salary.get(i)*1.20);


        }
        System.out.println(salary);


    }
}

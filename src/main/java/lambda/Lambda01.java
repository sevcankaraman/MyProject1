package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);

        printElements1(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();
        printProductOfCubeOfDistinctEvenElements(nums);
        System.out.println();
        getMaxValue1(nums);
        System.out.println();
        getMaxValue2(nums);
        System.out.println();
        getMaxValue3(nums);
        System.out.println();
        getMinValue1(nums);
        System.out.println();
        getMinValue2(nums);
        System.out.println();
        getMinGreaterThanSevenEven(nums);


    }
    // soru 1 :Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printElements1(List<Integer> nums) {

        for (Integer w : nums) {
            System.out.print(w + " ");

        }
    }

    // soru 2:Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(functıonal)

    //2.yol

    public static void printElements2(List<Integer> nums) {

        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    // soru 3 :Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printEvenElements1(List<Integer> nums) {

        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }


    }

    // soru 4 :Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(functıonal)

    public static void printEvenElements2(List<Integer> nums) {

        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));

    }

    //  soru 5: Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List<Integer> nums) {

        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    // soru 6 :  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk
    //  koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
    }

    // soru 7 :
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {

        Integer sum = nums.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);

    }

    //soru8

    public static void printProductOfCubeOfDistinctEvenElements(List<Integer> nums) {
        Integer product = nums.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
        System.out.println(product);


    }

    //9)Create a method to find the "maximum value" from the list elements
    //1.Yol:
    public static void getMaxValue1(List<Integer> nums) {

        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //2.yol:
    public static void getMaxValue2(List<Integer> nums) {

        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    //3.yol:
    public static void getMaxValue3(List<Integer> nums) {

        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max);

    }

    //10)Create a method to find the minimum value from the list elements
    //1.Yol:
    public static void getMinValue1(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> t > u ? u : t).get();
        System.out.println(min);

    }

    //2.yol
    public static void getMinValue2(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u) -> u).get();
        System.out.println(min);
    }

    //3.Yol:
    public static void getMinValue3(List<Integer> nums) {

        Integer min = nums.stream().distinct().sorted().reduce((t, u) -> t).get();
        System.out.println(min);
    }

    public static void getMinValue4(List<Integer> nums) {

        Integer min = nums.stream().distinct().reduce((t, u) -> Math.min(t, u)).get();
        System.out.println(min);


    }

    //11)Create a method to find the minimum value which is greater than 7 and even from the list
    //   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi
    public static void getMinGreaterThanSevenEven(List<Integer> nums){

        Integer min=nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();
        System.out.println(min);


    }
}

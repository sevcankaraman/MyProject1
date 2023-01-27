package bastansonatekrar.ifstatement;

public class MultiDimensionalArray05 {
    public static void main(String[] args) {
        //EXample 1: Bir multi dimensional array'deki en buyuk ve en kucuk sayinin toplamini ekrana yazdiriniz

        int a[][] = { {21, 5}, {14, 70, 11} };
        int kucuk=a[0][0];
        int buyuk=a[0][0];

        for (int [] w:a ) {
            for ( int k:w ) {
               kucuk= Math.min(kucuk,k);
                buyuk =Math.max(buyuk,k);

            }

        }

        System.out.println(kucuk+buyuk);





    }
}

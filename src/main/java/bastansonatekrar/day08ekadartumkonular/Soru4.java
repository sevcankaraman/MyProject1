package bastansonatekrar.day08ekadartumkonular;

public class Soru4 {
    //method olusturma
    public static void main(String[] args) {

        int sonuc=add(5,3);
        System.out.println(sonuc);

        int sonuc2=carpma(7,8);
        System.out.println(sonuc2);

        int sonuc3=sonuc(1,2,3);
        System.out.println(sonuc3);

    }

    public static int add(int a, int b){
        return a+b;
    }
    protected static int carpma(int a,int b) {
        return a * b;
    }

    //verilen 3 sayıdan ilk ıkısını carpan ve sonucu 3 .sayı ıle toplayan methodu olusturunuz ve kullanınız

    public static int sonuc(int x, int y, int z){
        return (x*y)+z;

    }

}

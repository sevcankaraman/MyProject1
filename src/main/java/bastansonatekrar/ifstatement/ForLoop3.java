package bastansonatekrar.ifstatement;

public class ForLoop3 {
    //example1 : verilen bir stringte ilk a harfinden onceki tüm karakterleri konsola yazdırınız.
    // I love Java ==> I love J

    public static void main(String[] args) {
        String s="I love java";

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));

        }
    }
}

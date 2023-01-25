package bastansonatekrar.ifstatement;

public class ForLoop07_interview {

// interwiew questions

    //String karakterleri teker teker azdiran;
    //Eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz

    public static void main(String[] args) {

        String cumle="Ben bu kursu cok verimli bir sekilde  basaracagım";

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)=='a'){
                break;
            }

            System.out.print(cumle.charAt(i)+ " ");
        }

    }
}
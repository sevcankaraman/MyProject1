package bastansonatekrar.ifstatement;

public class ForLoop02 {

    //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan caharacter'lerini buyuk harf yapiniz
    //           ankara ==> AnKaRa

    public static void main(String[] args) {

        String s="ankara";

        for (int i = 0; i <s.length(); i++) {
            String ch=s.substring(i,i+1);

            if (i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }

    }

}

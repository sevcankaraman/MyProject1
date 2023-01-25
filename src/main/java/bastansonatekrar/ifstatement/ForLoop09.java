package bastansonatekrar.ifstatement;

public class ForLoop09 {

    //example 2: size verilen bir stringin palindrom olup olmadıgını kontrol eden kodu yazınız.
    // civic,nalan,kucuk,11211 ==> palindrome

    //Logic: Stringi ters cevir sonra da duz hali ile ters halini karşılastır,aynı ise "palindrome"de.

    public static void main(String[] args) {
        String duz="civic" ;
        String ters="";

        for (int i = duz.length()-1; i >=0 ; i--) {
            ters=ters+duz.charAt(i);

        }
        if (duz.equals(ters)){
            System.out.println( "bu bir palindromedur");
        }else {
            System.out.println("bu bir palindrome değildir");
        }
    }


}

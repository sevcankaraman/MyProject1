package bastansonatekrar.ifstatement;

public class ForLoop08 {
//Example 1: Size verilen bir String'i tersten yazdiriniz(interwiew sorusu)
    ////           "Germany" ==> ynamreG

    public static void main(String[] args) {

        String s="sevcankaraman";
        String t="";

        for (int i = s.length()-1; i >=0 ; i--) {
            t=t+s.charAt(i);

        }
        System.out.println(t);
    }
}

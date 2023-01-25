package bastansonatekrar.ifstatement;

public class ForLoop05 {
    public static void main(String[] args) {

        //EXample 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz
//                   "Germany" ==> yn

        String s="Germany";

        for (int i = s.length()-1; i >0 ; i--) {

            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));
        }


    }

}

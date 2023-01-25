package bastansonatekrar.ifstatement;

public class ForLoop06 {
    //example 1 : Verilen bir string te 'a' karakteri hariç tüm karaterleri yazdırınız.
    //            "Madagaskar"=Mdgskr
    public static void main(String[] args) {


        String s = "Madakasgar";
        for (int i = 0; i < s.length(); i++) {
            char t=s.charAt(i);
            if (t=='a'){
                continue;
            }
            System.out.print(t);

        }


    }
}
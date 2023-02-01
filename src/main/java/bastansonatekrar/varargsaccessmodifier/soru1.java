package bastansonatekrar.varargsaccessmodifier;

public class soru1 {
    public static void main(String[] args) {

        System.out.println(m1(true, false, true));
        System.out.println(m1(false, true));
        System.out.println(m1(true, false, true, true));
     //   System.out.println(m1());
    }
    public static int m1(boolean b1, boolean... b2) {
        return b2.length;
    }

}

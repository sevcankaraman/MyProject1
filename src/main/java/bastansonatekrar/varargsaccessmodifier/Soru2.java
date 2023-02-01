package bastansonatekrar.varargsaccessmodifier;

public class Soru2 {
    public static void main(String[] args) {

        m2(1, 2, 3, 4);
        m2(1, 2, 3, 4, 5);
        m2(1, 2);
        //m2(1);

    }

    public static void m2(int i, int j, int... k) {
        System.out.println(k.length);
    }
}

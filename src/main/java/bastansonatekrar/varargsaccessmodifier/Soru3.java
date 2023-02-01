package bastansonatekrar.varargsaccessmodifier;

public class Soru3 {
    public static void main(String[] args) {
        m3("Result: ", 2, 3, 4);
       // m3("Result: ", 2, 2.5);
        m3("Result: ");
        m3("Result: ", 2);
    }
    public static void m3(String x, int... y) {
        int p = 1;
        for(int w: y) {
            p = p * w;
        }
        System.out.print(x);
        System.out.println(p);
    }
}

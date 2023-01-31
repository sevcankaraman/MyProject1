package bastansonatekrar.ifstatement;

public class PassByValue01 {
    public static void main(String[] args) {

        int fiyat=100;

        System.out.println("method da hesaplanan fiyat: "+ indirim(fiyat));
        System.out.println("method call sonrası fiyat: "+ (fiyat));
    }

    private static int indirim(int fiyat) {
        fiyat*=0.30;
        return fiyat;

    }


}

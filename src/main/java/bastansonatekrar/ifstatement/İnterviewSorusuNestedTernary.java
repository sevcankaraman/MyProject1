package bastansonatekrar.ifstatement;

public class İnterviewSorusuNestedTernary {
    public static void main(String[] args) {
        //intervıew sorusu

        //example1 : verilen yılın "artık(leap year)" yıl olup olmadıgını kontrol eden kodu yazınız
        //1)yıl 100 e bolunurse 400 e de bolunmelidir
        //2)yıl 100 e bolunmuyorsa 4 e bolunmelıdır

        int year= 1600;
        String result = year%100==0 ? (year%400==0 ? "Artık Yıl " : "Artık Yıl Değil") : (year%4==0 ? "Artık Yıl" : "Artık Yıl DEğil");
        System.out.println(result);
    }

}

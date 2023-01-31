package bastansonatekrar.ifstatement;

public class Static01 {

    public static String stdName="Sevcan Karaman";
    public int age=37;

    //öğrenci isminin ilk harflerini veren methodu olusturunuz.

    public static String ilkHarf(String isim){

        String ilk=isim.toLowerCase().substring(0,1);
        String ikinci=isim.toLowerCase().split(" ")[1].substring(0,1);
        return ilk+ikinci;
    }

    ////öğrenci ismindeki sesli harfleri (a,e,i,o,u) sayan bir method olusturunuz.

    public int sesliHarfleriSay(String isim){

        int sayac=0;
        for (int i = 0; i < isim.length(); i++) {
            char karakter =isim.toLowerCase().charAt(i);

            switch (karakter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                sayac++;
                break;
            }

        }
        return  sayac;
    }
}

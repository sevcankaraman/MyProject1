package bastansonatekrar.ifstatement;

public class Static01_Runner {
    public static void main(String[] args) {

        System.out.println(Static01.stdName);

        Static01 std1=new Static01();
        System.out.println(std1.age);

        Static01 std2=new Static01();
        System.out.println(std2.age);

       String harf= Static01.ilkHarf("Sevcan Karaman");
        System.out.println(harf);


        Static01 std3=new Static01();
        System.out.println(std3.sesliHarfleriSay("sevcan "));


    }
}

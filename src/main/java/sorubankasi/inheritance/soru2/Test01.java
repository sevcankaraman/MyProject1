package sorubankasi.inheritance.soru2;

public class Test01 {
    public static void main(String[] args) {
        go();
        go(12);
        go(5>=5);



    }
    public static void go(){
        System.out.println("Bad");
    }
    public static void go(double i){
        System.out.println("Good");
    }
    public static void go(boolean b){
        if(b) {
            System.out.println("the best");
        }else{
            System.out.println("the worst");
        }
    }
}

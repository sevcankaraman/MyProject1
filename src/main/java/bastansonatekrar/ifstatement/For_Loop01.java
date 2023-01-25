package bastansonatekrar.ifstatement;

public class For_Loop01 {
    public static void main(String[] args) {

        for (int j = 10; j < 31; j++) {
            System.out.print(j + ",");

        }
        System.out.println();
        //Example 3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 40; i >23 ; i--) {
            if(i%2==0){
                System.out.print(i+" ,");
            }

        }

    }
}

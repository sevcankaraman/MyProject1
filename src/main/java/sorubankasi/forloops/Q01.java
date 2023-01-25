package sorubankasi.forloops;

public class Q01 {
    public static void main(String[] args) {
      //soru1:

        int sum=0;
        for (int i = 1; i <6 ; i++) {
            sum=sum+i;
            
        }
        System.out.println("sum = " + sum);

        //soru2:

        int sum1=0;
        for (int i = 10; i >0 ; i=i-5) {
            sum1=sum1+i;
            
        }
        System.out.println("sum1 = " + sum1);

        //soru3:

        for (int i = 0; i <=10 ; i=i+3 ) {
            System.out.print(i+" ");


                  }

        System.out.println();

        //soru4
        int product=1;

        for (int j = 5; j >=0 ; j--) {
            product=product*j;

        }
        System.out.println("product = " + product);

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + " ");
            i++;

        }
        System.out.println();

        for ( char i = 'f'; i>'a'; i--){
            System.out.print(i + " " );
            i--;
        }
        System.out.println();

        for (int count = 1; count <11; count++) {
            System.out.println("Welcome to Java");
        }

        for(int i=1; i<=5; i++) {
            for(int j=(5-i); j>1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }


        
    }
   
    
}

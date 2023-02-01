package bastansonatekrar.ifstatement;



    public class Car {
        int price = 50;

        public void Car(int price) {
            this.price = price;
        }

        public static void main(String[] args) {
            Car c1 = new Car();
            System.out.println(c1);
        }
    }
package sorubankasi.overriding;

public class AnimalRunner {
    public static void main(String[] args) {

        System.out.println("-----------------------");

        Cat myCat=new Cat();
        myCat.eat();
        myCat.drink();
        myCat.meow();
        myCat.feedWithMilk();

        System.out.println("-----------------------");

        Dog myDog=new Dog();
        myDog.eat();
        myDog.drink();
        myDog.hav();
        myDog.feedWithMilk();

        System.out.println("-----------------------");

        Bird myBird=new Bird();
        myBird.uc();
        myBird.drink();
        myBird.eat();

        System.out.println("-----------------------");

    }

}

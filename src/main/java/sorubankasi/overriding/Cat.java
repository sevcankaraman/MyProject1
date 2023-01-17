package sorubankasi.overriding;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("cats meow");
    }

    @Override
    public void eat() {
        System.out.println("cats eat...");

    }

    @Override
    public void drink() {
        System.out.println("cats drinks...");
    }
}

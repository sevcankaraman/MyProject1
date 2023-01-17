package sorubankasi.overriding;

public class Dog extends Mammal{
    public void hav(){
        System.out.println("köpekler havlar");
    }

    @Override
    public void eat() {
        System.out.println("kopekler yer...");
    }

    @Override
    public void drink() {
        System.out.println("köpekler içer...");
    }
}

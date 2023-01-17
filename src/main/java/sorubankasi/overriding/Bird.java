package sorubankasi.overriding;

public class Bird extends Animal {

    public void uc(){
        System.out.println("kuslar ucar");
    }

    @Override
    public void eat() {
        System.out.println("kuslar yer...");
    }

    @Override
    public void drink() {
        System.out.println("kuşlar içer...");
    }
}

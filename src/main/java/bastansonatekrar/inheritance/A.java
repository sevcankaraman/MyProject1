package bastansonatekrar.inheritance;

public class A {
    public static void main(String[] args) {
        B b= new B();
        b.m();
        System.out.println(b.x);

        C c= new B();
        c.m();
        System.out.println(c.x);

        C d= new C();
        d.m();
        System.out.println(c.x);

        D child=new D();
        System.out.println(child.x);//20
        System.out.println(child.sayi);//50
        child.m();//bad

        C bebek =new D();
        System.out.println(bebek.x);//10
        bebek.m();//bad


    }
}

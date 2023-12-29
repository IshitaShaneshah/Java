package methodOverloading;

class Animal{
}
class Monkey extends Animal{

}
public class OverloadingDemo7 {
    public static void main(String[] args) {

        OverloadingDemo7 obj=new OverloadingDemo7();

        Animal a = new Animal();
        obj.fun(a);

        Monkey m = new Monkey();
        obj.fun(m);

//In overloading,method resolution always taken care by compiler based on reference type not on runtime object
//therefore am is reference so animal version called
        Animal am = new Monkey();
        obj.fun(am);
    }

    public void fun(Animal a){
        System.out.println("Animal version");
    }
    public void fun(Monkey m){
        System.out.println("Monkey version");
    }
}

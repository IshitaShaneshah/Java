package constructorDemo;

class A1{
//    a class can have multiple constructor having same name it is called constructor overloading
    A1(float i){
        this(10);
        System.out.println("Inside float constructor");
    }
    A1(int i){
        this();
        System.out.println("Inside int constructor");
    }
    A1(){
        System.out.println("Inside no-args constructor");
    }

}
public class constructorOverloading {
    public static void main(String[] args) {
        A1 obj=new A1(7.8F);
        A1 obj2=new A1(7);

    }
}

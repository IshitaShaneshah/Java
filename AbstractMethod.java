public class AbstractMethod {
//    abstract only used with method and class

//    error
//        Vehicle v=new Vehicle();
    public static void main(String[] args){
        TestDemo2 t=new TestDemo2();
        t.fun2();
        TestDemo2.fun();
        TestDemo.fun();
    }

}

//abstract class is a class that contain partial implementation,abstract methods or dummy methods
// we can't create object of abstract class
abstract class Vehicle{
//    No implementation only declaration
//    implementation is provided by child class
//    if a class contain atleast one abstract it must be declared abstract
    abstract public int getNoofVehicles();

//    abstract public int fun(){}   -- error
//    public int fun();    --error
}

abstract class TestDemo{
    public static void fun(){
        System.out.println("Hello world");
    }

    public void fun2(){
        System.out.println("Say hello again");
    }

    abstract public void m1();
    abstract public void m2();
}

class TestDemo2 extends TestDemo {
    public void m1(){

    }
//    the child class must provide implementation for all abstarct method else error
    public void m2(){

    }
}


// advantage of using abstract method- polymorphism , compulsory for child class to provide implementation.
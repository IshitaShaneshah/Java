package constructorDemo;

public class superThisKeyword {
    public static void main(String[] args) {
        Child c=new Child();
        c.m();
    }
}
class Parent{
    int x=10;
}
class Child extends Parent{
    int x=20;
    void m(){
        System.out.println(x);
//        points to same class
        System.out.println(this.x);
//        points to parent class
        System.out.println(super.x);

    }
}
// this and super can be used inside method and constructor but can't be used in static method

// difference between super(),this() and super,this keyword
//super() and this() are constructor call to call parent class and current class constructor
// We can use them in constructor as first line
// can't use both simultaneously

// super and this keyword used to refer super class and current class instance member
// can write anywhere except static methods
// we can use nay number of times
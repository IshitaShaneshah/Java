package constructorDemo;

public class ParentChildSuper {

}


// allowed as super(); -> parent default constructor call
class Parent1{

}
class Child1 extends Parent1{

}


// super() in child class constructor would call Parent2 no-args constructor
class Parent2{
    Parent2(){

    }
}
class Child2 extends Parent2{

}


// here error as super in child class can't invoke parameterized constructor
//therefore it is recommended to have a no-args constructor in child class

class Parent3{
    Parent3(int i){

    }
}
class Child3 extends Parent3{

//    error removed by bellow lines
    Child3(){
        super(10);
    }
}
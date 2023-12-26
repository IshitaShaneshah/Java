package constructorDemo;


public class DefaultConstructor {
}
// a class can't have both default and customized constructor simultaneously
// every class have a constructor even abstract class
class T{
    //compiler creates default constructor therefore it is no-args constructor
//    access modifier of default constructor is same as class modifier ( only applicable for public and default)
//    default constructor contain only one line -- no args call to super(); ( that is why when we create child class parent class constructor is called)
}
class T2{

//    this is user defined constructor
    T2(){

    }
}
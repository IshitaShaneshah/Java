package constructorDemo;

public class ConstructorAbstractInterface {
}

interface A{
////    can't contain constructor
//    A( ){
//
//    }
}

abstract class B{
    int i;
    B(int a){
        i=a;
    }
//    in abstract class , constructor can be made it is used to initialize variables even though object can't be created.
}
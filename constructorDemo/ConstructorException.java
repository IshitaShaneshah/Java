package constructorDemo;

import java.io.IOException;

public class ConstructorException {
    public static void main(String[] args) throws IOException {
        C1 c=new C1();
        C2 c2 = new C2();
    }
}

// for checked exception necessary to write exception in child if parent throws exception
class P1{
    P1() throws IOException {

    }
}
class C1 extends P1{
////    java: unreported exception java.io.IOException; must be caught or declared to be thrown
//    C1(){
//
//    }
    C1() throws IOException{

    }
}


// for unchecked exception - not necessary to write throws in child if parent throws an exception
class P2{
    P2() throws ArithmeticException{
//        throw new ArithmeticException();
    }
}
class C2 extends P2{
    C2(){

    }
}

// children can throw parent exception
class P3{
    P3() throws IOException {

    }
}
class C3 extends P3{
    C3() throws Exception{

    }
}
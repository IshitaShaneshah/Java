package constructorDemo;

public class RecursiveConstructor {
//    when methods are called recursively then runtimeexception -stackoverflow
    public static void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }
    public static void main(String[] args){
        System.out.println("Hello");
        m1();
    }
}

//class Recur{
//
////     it gives compile time error - java: recursive constructor invocation
////    even though object is not created
//    Recur(){
//        this(10);
//    }
//    Recur(int i){
//        this();
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Hello");
//    }
//}

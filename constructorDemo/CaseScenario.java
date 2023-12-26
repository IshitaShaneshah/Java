package constructorDemo;

public class CaseScenario {
//     the first line must be super() or this() in constructor
//    if not then compiler place super();
}

//// compiler code in comment
//class A{
//
//}
////class A{
////    A(){
////        super();
////    }
////}
//
//
//public class B{
//
//}
////public class B{
////    public B(){
////        super();
////    }
////}
//
//class C{
//    void C(){
//
//    }
//}
//
////class C{
////    void C(){
////
////    }
////    C(){
////        super();
////    }
////}
//
//
//class D{
//    D(){
//
//    }
//}
//
////class D{
////    D(){
////        super();
////    }
////}
//
//class E{
//    E(int i){
//        this();
//    }
//
//    E(){
//
//    }
//}
//
////class E{
////    E(int i){
////        this();
////    }
////
////    E(){
////        super();
////    }
////}
//
//
//class F{
//    F(int i){
//        super();
//    }
//}
//
////same code
//
//
//class G{
//    G(){
//        System.out.println("Hello");
//        super();    // error super must be at first line
//    }
//}
//
//class H{
//    H(){
//        super();
//        this();  // error this must be at first line ( super and this can't use simultaneously)
//        System.out.println("Hello");
//    }
//}
//
//class I{
//    void m(){
//        super();  // error call to super must be first statement in constructor ( can't use super and this in method)
//        System.out.println("method");
//    }
//}
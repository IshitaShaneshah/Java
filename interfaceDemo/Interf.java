package interfaceDemo;

//Any service requirement specification
//any contract b/w client and service provider
//100 % abstract class
public interface Interf {
//   if we don't know anything about implementation just we have requirement specification then we should go for interface


// 100% abstraction
////    can't create constructor of interface
//    Interf(){
//
//    }

//    necessary to initialize variable while declaring as it is public static final
//    int i;  //error
    int i=10;

    void m1();  //by default - public abstract

    void m2();


//  can't create static or instance block
//    {
//
//    }
//
//    static{
//
//    }
}

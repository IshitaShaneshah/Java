package inheritanceDemo;

public class MultipleInheritance {
    public static void main(String[] args) {
        Children obj= new Children();
        obj.m();
//        obj.m2();

    }
}

// interface support multiple inheritance as it only provides definition and
// implementation is provided by the children itself
interface Parent1{
    void m();

//    void m2();
}

interface Parent2{
    void m();

//    int m2();
}
abstract class Child implements Parent1,Parent2{
    public void m(){
        System.out.println("Hello");
    }

////    java: m2() in inheritanceDemo.Child cannot implement m2() in inheritanceDemo.Parent2
////  return type void is not compatible with int
//    @Override
//    public void m2(){
//
//    }

//    @Override
//    public int m2(){
//        return 0;
//    }
}

class Children extends Child{
////    java: m2() in inheritanceDemo.Children cannot implement m2() in inheritanceDemo.Parent1
////  return type int is not compatible with void
//    public int m2(){
//        return 0;
//    }
}



// ques - if a class Child extends Parent,and every class is child of Object then its a case of multiInheritance how its possible
// ans - if a class don't inherit any class then it directly inherits Object class
// but if it inherit a class than it indirectly inherit Object class

// internally
class X extends Object{

}
class Y extends X{
//    Y class don't extends Object class
}

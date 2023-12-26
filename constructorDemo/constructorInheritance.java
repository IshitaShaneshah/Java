package constructorDemo;

public class constructorInheritance {
//    C c=new C();
//    error as child class don't have a no-args constructor hence constructor is not inherited.
// if inheritance is not possible so overriding also not possible.
}
class P{
    P(){
        System.out.println("Parent class");
    }
}
class C extends P{
    C(int i){
        System.out.println("In child class");
    }
}




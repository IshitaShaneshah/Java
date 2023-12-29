package methodOverloading;

//In overloading,method resolution always taken care by compiler based on reference type not on runtime object
//compile-time polymorphism , static polymorphism , early binding
public class OverloadingDemo{
    public int m(int a){
        System.out.println("int-arg method");
        return 0;
    }
    public void m(float f){
        System.out.println("float-arg method");
    }
//    public void m(int a,int b){
//
//    }
//    public void m(String s){
//
//    }
}
class Main{
    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        obj.m(11);
        obj.m(12.25f);
//        when compiler don't get exact match then it promotes the argument type this is called automatic promotion
//        byte -> short -> int -> long -> float -> double
//        char -> int
        obj.m('a');  // int-arg method called
        obj.m(8l);   // float-arg method called
//        obj.m(8.09);  //no match found for double
//        obj.m(null);  //java: no suitable method found for m(<nulltype>)
    }
}
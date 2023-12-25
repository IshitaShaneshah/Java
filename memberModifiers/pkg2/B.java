package memberModifiers.pkg2;

import memberModifiers.pkg1.A;

public class B {
    public static void main(String[] args) {
        System.out.println("In class C");
        A a=new A();
        a.m1();      //can be accessed anywhere as public
//       a.m2();   // can't access outside as private
//        a.m3();     // m3() has protected access in memberModifiers.pkg1.A // can be accessed outside only using child class
//        a.m4();     //cannot be accessed from outside package
    }
}

class E extends A{
    public static void main(String[] args) {
        System.out.println("In class C");
        A a=new A();
        a.m1();      //can be accessed anywhere as public
//       a.m2();   // can't access outside as private

//        a.m4();     //cannot be accessed from outside package

//        a.m3();   // can be used outside the package in class but only by child class reference
        E e=new E();
        e.m3();

        A a2=new E();
//        a2.m3(); // can be used outside the package in class but only by child class reference
    }
}

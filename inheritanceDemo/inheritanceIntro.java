package inheritanceDemo;


// inheritance is-a relationship
// advantage is code re-usability and done through extends keyword.
//Object is the parent class of every class

public class inheritanceIntro {
//    in parent we write common method and in child we write child specific methods
    public static void main(String[] args) {
        C c=new C();
        c.m2();
        c.m1();
        P p=new P();
        p.m1();
//        p can't access child member
//        p.m2();

        P p2=new C();
        p2.m1();
//        parent class reference can be made using child class object but can't access child specific member
//        p2.m2();

//        can't use child reference to hold parent object
//        C c2=new P();
    }
}

class P{
    void m1(){
        System.out.println("Inside Parent class");
    }
}
class C extends P{
    void m2(){
        System.out.println("Inside child class");
    }
}


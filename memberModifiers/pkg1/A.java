package memberModifiers.pkg1;


// first check class modifier then member modifier
// if a class is default and its member is public still can't be used outside the package
public class A {
    public void m1(){           //can be accessed anywhere - global level
        System.out.println("In class A public method");
    }
    private void m2(){          //can be accessed within the same class -class level
        System.out.println("In class A private method");
    }

    protected void m3(){        //can be accessed anywhere within the same package and outside the package by child class ( using child class reference only )
        System.out.println("In class A protected method");
    }

    void m4(){  //can be accessed anywhere within the same package -package level
        System.out.println("In class A default method");
    }
}

class C extends A{
   public static void main(String[] args){
       System.out.println("In class C");
       A a=new A();
       a.m1();      //can be accessed anywhere as public
//       a.m2();   // can't access outside as private
       a.m3();     // can be accessed within same package anywhere and outside package from child class
       a.m4();
   }
}

class D{
    public static void main(String[] args){
        System.out.println("In class D");
        A a=new A();
        a.m1();       //can be accessed anywhere as public
//        a.m2();    //m2() has private access in memberModifiers.pkg1.A
        a.m3();
        a.m4();
    }
}
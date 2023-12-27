package inheritanceDemo;

public class TypesInheritance {

}

// single inheritance
class A{

}
class B extends A{

}


// multilevel inheritance
class D{

}
class E extends D{

}
class F extends E{

}


//multiple inheritance ( not supported in java in accordance to class)
// diamond problem,ambiguity problem
class G{
    void m(){
        System.out.println("G");
    }
}
class I{
    void m(){
        System.out.println("I");
    }
}
//class H extends G,I{
//
//}
// if m method is called using H object then it forms ambiguity which class m needs to be called


// hierarchical inheritance
class J{

}
class K extends J{

}
class L extends J{

}


// hybrid - mixture of more than one type of inheritance ( not supported in java)


// cyclic inheritance - not supported
//class M{
//
//}
//class M extends M{
//
//}

//// its better to merger these classes
//class N extends O{
//
//}
//class O extends N{
//
//}
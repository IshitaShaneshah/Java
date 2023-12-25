package outerClass.pk2;
import outerClass.pk1.OuterClassModifier;
import outerClass.pk1.OuterClassModifier2;

public class Demo {
    public static void main(String[] args) {

//      can access public class from different package
        OuterClassModifier obj = new OuterClassModifier();

//        unable to access default class outside the package
//        can be accessed anywhere within the same package
        OuterClassModifier2 obj2 = new OuterClassModifier2();
    }

}

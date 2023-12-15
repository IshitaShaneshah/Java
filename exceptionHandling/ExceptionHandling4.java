import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.io.IOException;

// If the superclass method does not declare an exception, subclass overridden
// method cannot declare the checked exception but it can declare unchecked exception.



//class Parent{
//    public void msg(){
//        System.out.println("In parent");
//    }
//}
//public class ExceptionHandling4 extends Parent{
//    public void msg() throws IOException{
//        System.out.print("In child");
//    }
//    public static void main(String[] args){
//        Parent obj=new ExceptionHandling4();
//        obj.msg();
//    }
//}




//class Parent{
//    public void msg(){
//        System.out.println("In parent");
//    }
//}
//public class ExceptionHandling4 extends Parent{
//    public void msg() throws ArithmeticException{
//        System.out.print("In child");
//    }
//    public static void main(String[] args){
//        Parent obj=new ExceptionHandling4();
//        obj.msg();
//    }
//}



// if parent throws exception than same should be done in overriding method - only checked



//class Parent{
//    public void msg() throws ArithmeticException{
//        System.out.println("In parent");
//    }
//}
//public class ExceptionHandling4 extends Parent{
//    public void msg(){
//        System.out.print("In child");
//    }
//    public static void main(String[] args){
//        Parent obj=new ExceptionHandling4();
//        obj.msg();
//    }
//}


//class Parent{
//    public void msg() throws IOException{
//        System.out.println("In parent");
//    }
//}
//public class ExceptionHandling4 extends Parent{
//    public void msg(){
//        System.out.print("In child");
//    }
//    public static void main(String[] args){
//        Parent obj=new ExceptionHandling4();
//        obj.msg();
//    }
//}




// If the superclass method declares an exception, subclass overridden method can declare same,
// subclass exception or no exception but cannot declare parent exception.

//class Parent{
//    public void msg() throws ArithmeticException{
//        System.out.println("In parent");
//    }
//}
//public class ExceptionHandling4 extends Parent{
//    public void msg() throws Exception{
//        System.out.print("In child");
//    }
//    public static void main(String[] args){
//        Parent obj=new ExceptionHandling4();
//        obj.msg();
//    }
//}



class Parent{
    public void msg() throws Exception{
        System.out.println("In parent");
    }
}
public class ExceptionHandling4 extends Parent{
    public void msg() throws ArithmeticException{
        System.out.print("In child");
    }
    public static void main(String[] args){
        Parent obj=new ExceptionHandling4();
        try {
            obj.msg();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
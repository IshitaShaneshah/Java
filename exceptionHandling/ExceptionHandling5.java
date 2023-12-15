//
//// exception is propagated in unchecked exception
//public class ExceptionHandling5 {
//    public void m(){
//       int i= 10/0;
//    }
//    public void n(){
//        m();
//    }
//    public void p(){
//        n();
//    }
//    public static void main(String[] args){
//        ExceptionHandling5 obj=new ExceptionHandling5();
//        try{
//            obj.p();
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.print("rest of code");
//    }
//}





import java.io.IOException;

// exception is not propagated in checked exception
// using throws we can propagate checked exception
public class ExceptionHandling5 {
    public void m() throws IOException {
        throw new IOException("Exception found");
    }
    public void n() throws IOException{
        m();
    }
    public void p() throws IOException{
        n();
    }
    public static void main(String[] args) throws IOException{
        ExceptionHandling5 obj=new ExceptionHandling5();
        try{
            obj.p();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.print("rest of code");
    }
}




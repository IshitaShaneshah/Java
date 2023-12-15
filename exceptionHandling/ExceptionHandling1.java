// try - catch - finally(finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.)
public class ExceptionHandling1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        try{
            System.out.println("In try");
            int v = 10/0;
            System.out.println("after exception found"+v);
//            this line is not executed
        }
         catch(ArithmeticException e){
             System.out.println("In catch "+e);
         }
        finally{
            System.out.println("In finally block");
        }

        System.out.println("byeee world");


//        output without catch
//        Hello World
//        In try
//        In finally block
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at ExceptionHandling1.main(ExceptionHandling1.java:7)


//        output with catch ( try can be used with finally also )
//        Hello World
//        In try
//        In catch java.lang.ArithmeticException: / by zero
//        In finally block
//        byeee world

//        catch should be just after a try block


//      The JVM firstly checks whether the exception is handled or not. If exception is not handled, JVM provides a default exception handler that performs the following tasks:
//      Prints out exception description.
//      Prints the stack trace (Hierarchy of methods where the exception occurred).
//      Causes the program to terminate.



    }
}

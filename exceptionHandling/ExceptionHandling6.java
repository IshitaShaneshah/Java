////throw on unchecked exception
//public class ExceptionHandling2 {
//    public static void ageValidate(int age){
//        if(age<18){
//            throw new ArithmeticException("Person not eligible to vote");
//        }
//        else{
//            System.out.println("You are eligible");
//        }
//    }
//    public static void main(String[] args){
////        try{
//            ageValidate(8);
////        }
////        catch(Exception e){
////            System.out.println(e);
////        }
//        System.out.println("rest code");
//    }
//}



// custom exception
class InValidAge extends Exception{
    InValidAge(String str){
        super(str);
    }
}
public class ExceptionHandling6{
    public static void ageCheck(int age) throws InValidAge{
        if(age<18){
            throw new InValidAge("You are not eligible");
        }
        else {
            System.out.println("You are eligible");
        }
    }
    public static void main(String[] args){
        try{
            ageCheck(7);
        }
        catch(InValidAge e){
            System.out.println(e.getMessage());
        }
        System.out.println("rest of code");
    }
}

// if throws not used then error - unreported exception InValidAge; must be caught or declared to be thrown
//  nested try - catch block
public class ExceptionHandling3 {
    public static void main(String[] args){
        try{
            try{
                System.out.println("Inner try block 1");
                try{
                    String str=null;
                    System.out.println(str.length());
                }
                finally{
                    System.out.println("Yee! It worked");
                }
                System.out.println("Inner try block 2");
            }catch(ArithmeticException ex){
                System.out.println("You have encountered an exception "+ex);
            }

        }
        catch(Exception e){
            System.out.println("Outer catch block");
            System.out.println("You have encountered an exception "+e);
        }
    }
}

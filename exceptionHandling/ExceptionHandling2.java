// multiple catches ( most specific to general )
public class ExceptionHandling2 {

    public static void main(String[] args) {

        System.out.println("Hello world");
        try {
            int arr[] = new int[5];
//            arr[5]=10/0;
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("In first exception block");
            System.out.println("An exception had been occurred " + e);
        } catch (NullPointerException e) {
            System.out.println("In second exception block");
            System.out.println("An exception had been occurred " + e);
        } catch (Exception e) {
            System.out.println("In third exception block");
            System.out.println("An exception had been occurred " + e);
        }


////     if put general at top then compile time error - exception has already been caught
//        try{
//            int arr[]=new int[5];
////            arr[5]=10/0;
//            System.out.println(arr[5]);
//        }
//        catch(Exception e){
//            System.out.println("In first exception block");
//            System.out.println("An exception had been occurred "+ e);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("In second exception block");
//            System.out.println("An exception had been occurred "+ e);
//        }
//        catch(ArithmeticException e){
//            System.out.println("In third exception block");
//            System.out.println("An exception had been occurred "+ e);
//        }
    }
}

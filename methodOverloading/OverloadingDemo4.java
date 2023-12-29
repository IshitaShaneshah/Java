package methodOverloading;

public class OverloadingDemo4 {
    public void m(String s){
        System.out.println("string version");
    }
    public void m(StringBuffer s){
        System.out.println("string-buffer version");
    }

    public static void main(String[] args) {
        OverloadingDemo4 obj = new OverloadingDemo4();
        obj.m("Heello");
        obj.m(new StringBuffer());

//       ambiguity as both are applicable for null
//        String -> Object
//        StringBuffer -> Object
//        obj.m(null);
    }
}

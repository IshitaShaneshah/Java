package methodOverloading;

public class OverloadingDemo6 {
    public void method(int i,float f){
        System.out.println("int-float arg");
    }
    public void method(float f,int i){
        System.out.println("float-int arg");
    }
    public static void main(String[] args) {
        OverloadingDemo6 obj= new OverloadingDemo6();
        obj.method(2,8.4f);
        obj.method(9.3f,6);
//        ambiguity
//        obj.method(8,9);

//        no-method found
//        obj.method(8.3,9,3);

    }
}

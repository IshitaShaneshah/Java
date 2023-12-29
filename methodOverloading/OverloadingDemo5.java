package methodOverloading;

public class OverloadingDemo5 {
    public void m(int i){
        System.out.println("single int-arg");
    }
    public void m(int... k){
        System.out.println("many int-arg");
    }

    public static void main(String[] args) {
        OverloadingDemo5 obj=new OverloadingDemo5();
        obj.m();
        obj.m(9,8,2);

//        general argument is given preference over variable-argument method
        obj.m(3);
    }
}

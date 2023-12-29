package methodOverloading;

public class OverloadingDemo2 {
    public void m1(){
        System.out.println("no-arg version");
    }
    public void m1(Object obj){
        System.out.println("object version");
    }

    public void m1(String s){
        System.out.println("string version");
    }

    public static void main(String[] args){
        OverloadingDemo2 obj=new OverloadingDemo2();
        obj.m1(new Object());
        obj.m1("name");

//        null applicable for string and object
//        but string is child of object- so in such cases always child class is given preference
        obj.m1(null);
    }
}

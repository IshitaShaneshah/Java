package constructorDemo;

public class Test {
    //    called automatically so therefor can't have a return type even void
//    if return type is written it treat as method
    void Test(){
        System.out.println("Hello world");
    }
}
class Demo{
    public static void main(String[] args) {
        Test t=new Test();  // above constructor not implemented
        t.Test();
    }
}
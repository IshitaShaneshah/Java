public class MethodSignature {

//    method name + method parameters = method signature
//    in a class two methods can't have same signature
//    return type is not part of method signature
    public void m(int i){

    }

    public void m2(int i,int j){

    }

    public int m2( int i){
        return i;
    }

//    public int m2(int l, int m){
//
//    }
}
class TDemo{
    public static void main(String[] args) {
        MethodSignature obj = new MethodSignature();
        obj.m(12);
        obj.m2(13,12);
    }
}
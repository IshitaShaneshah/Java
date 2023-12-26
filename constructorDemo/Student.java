package constructorDemo;

public class Student {
    private String name;
    private int rollNo;

//    use to initialize object
//    name of class and constructor same
// modifier allowed for constructor are public,private(used to create singleton classes - classes that can have only one object),protected,default
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
}
class Main{
    public static void main(String[] args) {
        Student s1=new Student("Ishita shaneshah",23);
        Student s2=new Student("Naaz ansari",22);

    }
}

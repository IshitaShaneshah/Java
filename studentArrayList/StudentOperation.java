package collection.studentArrayList;


import java.util.*;

public class StudentOperation {
    public static void main(String[] args){
        List<Student> studentList=new ArrayList<>(10);
        Scanner sc=new Scanner(System.in);
        addManyStudents(studentList);
        while(true){
            System.out.println("1.Add student");
            System.out.println("2.Delete a student");
            System.out.println("3.Update a student");
            System.out.println("4.Search a student by id");
            System.out.println("5.Search student by name");
            System.out.println("6.Display students");
            System.out.println("7.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:addStudent(studentList);
                       break;
                case 2:deleteStudent(studentList);
                       break;
                case 3:updateStudent(studentList);
                       break;
                case 4:searchStudent(studentList);
                       break;
                case 5:searchStudentByName(studentList);
                        break;
                case 6:displayStudents(studentList);
                        break;
                case 7:System.exit(0);
                default:System.out.println("U have entered wrong choice");
            }
        }
    }

    public static void addStudent(List<Student> studentList){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter details of Student");
        System.out.println("Enter name");
        String name= sc.nextLine();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter marks in 3 subjects (eng,hindi,maths) :" );
        HashMap<String,Integer> marks=new HashMap<>(3);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        marks.put("engMarks",m1);
        marks.put("hindiMarks",m2);
        marks.put("mathsMarks",m3);
        Student s=new Student(name,age,marks);
        studentList.add(s);
    }

    public static void addManyStudents(List<Student> studentList){
//        creating multiple hashMap reference as when using clear all it stores is {}
        HashMap<String,Integer> marks=new HashMap<>(3);
        marks.put("engMarks",23);
        marks.put("hindiMarks",45);
        marks.put("mathsMarks",56);
        Student s=new Student("Ishita shaneshah",23,new HashMap<>(marks));
//        marks.clear();

        marks.put("engMarks",78);
        marks.put("hindiMarks",23);
        marks.put("mathsMarks",45);
        Student s2=new Student("John Peterson",22,new HashMap<>(marks));
//        marks.clear();

        marks.put("engMarks",88);
        marks.put("hindiMarks",43);
        marks.put("mathsMarks",95);
        Student s3=new Student("Binod Kumar",23,new HashMap<>(marks));
//        marks.clear();

        studentList.add(s);
        studentList.add(s2);
        studentList.add(s3);

    }
    public static void deleteStudent(List<Student> studentList){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student rollNo u want to delete :");
        int rollNo=sc.nextInt();
        try{
            Student student=studentList.get(rollNo-1);
            System.out.println("The student will following properties is being deleted");
            System.out.println(student);
            studentList.remove(student);
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("No such student found");
        }


    }

    public static void updateStudent(List<Student> studentList){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student rollNo whose marks need to be updated :");
        int rollNo=sc.nextInt();
        try{
            Student student=studentList.get(rollNo-1);
            System.out.println("Enter marks in 3 subjects (eng,hindi,maths) :" );
            HashMap<String,Integer> marks=new HashMap<>(3);
            int m1=sc.nextInt();
            int m2=sc.nextInt();
            int m3=sc.nextInt();
            marks.put("engMarks",m1);
            marks.put("hindiMarks",m2);
            marks.put("mathsMarks",m3);
            student.setMarks(marks);
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("No such student found");
        }
    }

    public static void searchStudent(List<Student> studentList){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rollNo u wanna search for :");
        int rollNo=sc.nextInt();
        try{
            Student student=studentList.get(rollNo-1);
            System.out.println("Found student :");
            System.out.println(student);
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("No such student found");
        }

    }
    public static void searchStudentByName(List<Student> students){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name ");
        String name=sc.nextLine();
        for(Student s:students){
            if(s.getName().equals(name)){
                System.out.println(s);
            }
        }
    }
    public static void displayStudents(List<Student> students){
        Iterator iterator= students.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString()+" ");
            System.out.println();

        }

    }

}

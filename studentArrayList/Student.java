package collection.studentArrayList;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private static int count=0;
    private int rollNo;
    private String name;
    private int age;

    private HashMap<String,Integer> marks;

    private float percentage;
    Student(String name,int age,HashMap<String,Integer> marks){
        count+=1;
        this.rollNo=count;
        this.name=name;
        this.age=age;
        this.marks=marks;
        calculatePercentage();
    }

    public void setMarks(HashMap<String, Integer> marks) {
        this.marks = marks;
        calculatePercentage();
    }

    public String getName() {
        return name;
    }

    public void calculatePercentage(){
        float percentage=0;
        for(Map.Entry<String,Integer> m: marks.entrySet()){
            percentage+=m.getValue();
        }
        this.percentage=percentage/3;

    }
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", percentage=" + percentage +
                '}';
    }
}

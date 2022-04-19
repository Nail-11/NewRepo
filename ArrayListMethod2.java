package Colllection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        Student st1= new Student("Nail",'m', 26, 4, 4.45);
        Student st2 = new Student("Nikolay", 'm', 28,3,4.00);
        Student st3 = new Student("Elena",'w',19,2,3.50);
        Student st4 = new Student("Petr",'m',20,2,3.70);
        Student st5 = new Student("Mariya",'w',12,2,3.20);
        ArrayList<Student>studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println( studentList);


    }
}


class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;


    Student(String name , char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex=sex;
        this.age=age;
        this.course=course;
        this.avgGrade=avgGrade;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name=" + name + '\'' +
                ", sex =" + sex +
                ", age =" + age +
                ", course =" + course +
                ", avgGrade =" + avgGrade +
                '}';
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}
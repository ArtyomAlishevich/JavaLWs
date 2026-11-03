package org.example;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    public int id;
    private String name;
    public String group;
    private int course;
    public List<Integer> grades;

    public Student(int id, String name, String group, int course, List<Integer> grades) {
        this.id = id;
        setName(name);
        this.group = group;
        setCourse(course);
        this.grades = grades;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        if (course < 1) return;
        this.course = course;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < grades.toArray().length; i++) {
            sum += grades.get(i);
        }
        return Math.round(sum / grades.toArray().length * 100d) / 100d ;
    }

    public static void deductStudents(List<Student> arr) {

        arr.removeIf(student -> student.getAverageGrade() < 3);


        /*for(int i = 0; i < arr.toArray().length; i++) {
            if (arr.get(i).getAverageGrade() < 3) {
                arr.remove(i);
                i--;
            }
        }*/
    }
    public static void transferStudents(List<Student> arr) {
        for(int i = 0; i < arr.toArray().length; i++) {
            if (arr.get(i).getAverageGrade() >= 3) {
                arr.get(i).setCourse(arr.get(i).getCourse() + 1);
            }
        }
    }
    public static void printStudents(List<Student> arr, int course) {
        for(int i = 0; i < arr.toArray().length; i++) {
            if (arr.get(i).getCourse() == course) {
                System.out.println(arr.get(i));
            }
        }
    }
    public static void sortStudents(List<Student> arr) {
        arr.sort(Comparator.comparing(Student::getAverageGrade).reversed()
                .thenComparing(Student::getName));
    }

    @Override
    public String toString() {
        return "Студент №" + id + " " + getName() + " курс " + getCourse() + " средний балл: " + getAverageGrade();
    }
}

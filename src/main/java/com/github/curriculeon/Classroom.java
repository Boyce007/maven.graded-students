package com.github.curriculeon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Classroom {
    private List<Student> students;


    public Classroom(Student[] students) {
        this.students = new ArrayList<>(Arrays.asList(students));
    }

    public Classroom() {
        this.students = new ArrayList<>(Arrays.asList(new Student[0]));
    }

    public Student[] getStudents() {
        return students.toArray(new Student[0]);
    }


    public Double getAverageExamScore() {
        Double classTotal= 0.0;
        for (Student student:students) {
            Double studentAverage = student.getAverageExamScore();
            classTotal+=studentAverage;
        }
        Double classAverage = classTotal/students.size();
        return classAverage;
    }

    public Boolean addStudent(Student students) {
        return null;
    }

    public Boolean removeStudent(Student student) {
        return null;
    }

    public Student[] getStudentsByScore() {
        return null;
    }

    public Map<Student, Character> getGradeBook() {
        return null;
    }

}


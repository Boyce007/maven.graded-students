package com.github.curriculeon;


import java.util.*;

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

    public Boolean addStudent(Student student) {
        return students.add(student);
    }

    public Boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public Student[] getStudentsByScore() {

        for (int i = 0; i < students.size(); i++) {

        }


       return null;
    }

    public Map<Student, Character> getGradeBook() {
        Map<Student, Character> gradeBook = new HashMap<>();
        for (Student student:students) {
            Double averageGrade = student.getAverageExamScore();
            if (averageGrade>=84) {
                gradeBook.put(student,'A');
            } else if (averageGrade < 84 && averageGrade > 71) {
                gradeBook.put(student,'B');
            } else if (averageGrade < 70 && averageGrade > 56) {
                gradeBook.put(student, 'C');
            } else if (averageGrade <= 55 && averageGrade > 46) {
                gradeBook.put(student, 'D');
            } else {
                gradeBook.put(student, 'F');
            }
        }
        return gradeBook;
    }

}


package com.github.curriculeon;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private List<Double> testScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return null;
    }

    public void setLastName(String lastName) {
    }

    public Double[] getExamScores() {
        return this.testScores.toArray(new Double[0]);
    }

    public void addExamScore(double examScore) {
        testScores.add(examScore);
    }


    public void setExamScore(int examNum, double updateScore) {
        testScores.set(examNum,updateScore);
    }


    public Double getAverageExamScore() {
        Double total = 0.0;
        for (Double testsocre:testScores) {

        }
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    /**
     * @param studentToCompareAgainst the object to be compared; compare by grade, then by name
     * @return
     */
    @Override
    public int compareTo(Student studentToCompareAgainst) {
        return Integer.valueOf(null);
    }
}


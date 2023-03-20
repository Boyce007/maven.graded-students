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
        testScores = new ArrayList<>(Arrays.asList(new Double[0]));


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        for (Double testScore:testScores) {
            total+=testScore;

        }
        Integer totalAmountOfScores = testScores.size();
        Double average = total/totalAmountOfScores;
        return average;
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
        Double averageScores = getAverageExamScore();
        Double averageScoreToCompare = studentToCompareAgainst.getAverageExamScore();
        if (averageScores>averageScoreToCompare) {
            return averageScores.intValue();
        } else if (averageScores == averageScoreToCompare) { {
            String lastname = getLastName();
            String lastNameToCompare = studentToCompareAgainst.getLastName();
            Integer comparisonValue =  lastname.compareTo(lastNameToCompare);
            if (comparisonValue>0) {
                return averageScores.intValue();
            } else {
                return averageScoreToCompare.intValue();
            }


        }

        }
        return averageScoreToCompare.intValue();
    }
}


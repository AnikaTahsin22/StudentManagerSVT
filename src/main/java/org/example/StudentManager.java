package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private String name;
    private int bangla;
    private int math;
    private int english;


    public StudentManager(String name, int bangla, int english, int math) {
        this.name = name;
        this.bangla = bangla;
        this.english = english;
        this.math = math;
        students.add(this);
    }
    public String getName()
    {
        return name;
    }
    public int totalMarks() {

        return bangla + english + math;
    }
    public double averageMarks() {

        return totalMarks() / 3.0;
    }
    public String getGrade() {
        double marks=averageMarks();
        if (marks >= 80.0) return "A+";
        else if (marks >= 70.0) return "A";
        else if (marks >= 60.0) return "B";
        else if (marks >= 50.0) return "C";
        else if (marks >= 40.0) return "D";
        else return "F";
    }
    private List<StudentManager> students = new ArrayList<>();
    public void addStudent(String name, int bangla, int english, int math) {
        students.add(new StudentManager(name,bangla,english,math));
    }

    public void showHighestMarks() {
        int maxBangla = 0, maxEnglish = 0, maxMath = 0;

        for (StudentManager s : students) {
            if (s.bangla > maxBangla) maxBangla = s.bangla;
            if (s.english > maxEnglish) maxEnglish = s.english;
            if (s.math > maxMath) maxMath = s.math;
        }

        System.out.println("Highest Marks:Bangla:" + maxBangla+" English:" + maxEnglish+" Math:" + maxMath);
    }
    public void showTopper() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        StudentManager topper = students.get(0);
        for (StudentManager s : students) {
            if (s.totalMarks() > topper.totalMarks()) {
                topper = s;
            }
        }

        System.out.println("Topper:" + topper.name);
    }

}
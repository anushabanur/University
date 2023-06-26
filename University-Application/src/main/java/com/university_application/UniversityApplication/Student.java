package com.university_application.UniversityApplication;

public class Student {
    private String enrollmentNumber;
    private String name;
    private String subject;
    private int score;

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String enrollmentNumber, String name, String subject, int score) {
        this.enrollmentNumber = enrollmentNumber;
        this.name = name;
        this.subject = subject;
        this.score = score;
    }
}

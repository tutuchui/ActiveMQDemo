package com.example.activemqdemo.Entity;

public class Education {
    private String university;
    private String yearOfGraduate;
    private String major;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getYearOfGraduate() {
        return yearOfGraduate;
    }

    public void setYearOfGraduate(String yearOfGraduate) {
        this.yearOfGraduate = yearOfGraduate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Education{" +
                "university='" + university + '\'' +
                ", yearOfGraduate='" + yearOfGraduate + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

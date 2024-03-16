package com.comrade.utils;

public class StudentModel {
    private String fullName;
    private Integer age;


    public StudentModel(Student student) {
        this.fullName = student.getFirstName()+" "+student.getLastName();
        this.age = student.getAge();
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}

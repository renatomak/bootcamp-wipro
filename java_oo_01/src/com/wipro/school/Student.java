package com.wipro.school;

public class Student {
    private final float testWeight = 1.5f;
    private final float workWeight = 2.0f;

    private Long registration;
    private String name;
    private float test01 = 0;
    private float test02 = 0;
    private float work = 0;

    public Student(Long registration, String name, float test01, float test02, float work) {
        this.registration = registration;
        this.name = name;
        this.test01 = test01;
        this.test02 = test02;
        this.work = work;
    }

    public Float finalAvarage() {
        return (((this.test01 + this.test02) / 2 ) * testWeight + (work * workWeight))/(testWeight + workWeight);
    }

    public Integer recovery() {
        return this.finalAvarage() > 7 ? 1 : 0;
    }

    public String getName() {
        return name;
    }
}

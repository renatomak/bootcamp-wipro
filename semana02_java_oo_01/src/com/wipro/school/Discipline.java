package com.wipro.school;

import java.util.ArrayList;
import java.util.List;

public class Discipline {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Discipline(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }
}

package com.wipro.school;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
	    Student student = new Student(1L, "Renato", 5.5f, 3.6f, 7.0f);
        students.add(student);
        student = new Student(2L, "Ederson", 9.5f, 7.6f, 8.0f);
        students.add(student);
        student = new Student(3L, "Antonio", 6.5f, 9.6f, 5.9f);
        students.add(student);
        student = new Student(4L, "Larissa", 7.5f, 8.6f, 7.9f);
        students.add(student);

        Discipline discipline = new Discipline("Matemática", students);

        for (Student stud : students) {
            String isRecovery = stud.recovery() == 0 ? "Recuperação" : "Aprovado";
            String result = String.format("O aluno(a) %s com média %.2f está %s", stud.getName(), stud.finalAvarage(), isRecovery);
            System.out.println(result);
        }
    }
}

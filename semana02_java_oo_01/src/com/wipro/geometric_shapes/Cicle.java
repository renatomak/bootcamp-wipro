package com.wipro.geometric_shapes;

public class Cicle implements GeometricShaps{

    private static final double PI = 3.14f;
    private double radius;
    private double area;
    private String color;

    public Cicle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String color() {
        return "Laranja";
    }

    @Override
    public String numberOfSides() {
        return "Não tem lados.";
    }

    @Override
    public double area(double a, double b) {
        this.area = PI * this.radius * this.radius;
        return this.area;
    }

    public String toString() {
        return "Circulo { " +
                "Cor " + this.color + ", quantidade de lados = " + this.numberOfSides() + ", area = " + this.area;
    }


}

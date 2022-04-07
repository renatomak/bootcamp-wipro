package com.wipro.geometric_shapes;

public class RightTriangle implements GeometricShaps {

    protected String color;
    protected double area;

    public RightTriangle(String color) {
        this.color = color;
    }

    @Override
    public String color() {
        return "A cor do triangulo retangulo é " + this.color;
    }

    @Override
    public String numberOfSides() {
        return "Três";
    }

    @Override
    public double area(double a, double b) {
        this.area = (a * b) / 2;
        return this.area;
    }

    public String toString() {
        return "Triangulo retangulo { " +
                "Cor " + this.color + ", quantidade de lados = " + this.numberOfSides() + ", area = " + this.area + "}";
    }
}

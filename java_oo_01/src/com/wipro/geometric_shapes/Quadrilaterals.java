package com.wipro.geometric_shapes;

public abstract class Quadrilaterals implements GeometricShaps{

    protected String colorName;
    protected double area;

    public Quadrilaterals(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String color() {
        return "A cor do Quadrilatero é " + this.colorName;
    }

    @Override
    public String numberOfSides() {
        return "Quatro";
    }

    @Override
    public double area(double a, double b) {
        this.area = a * b;
        return this.area;
    }

    @Override
    public String toString() {
        return "Quadrilaterals { " +
                "Cor " + colorName + ", quantidade de lados = " + this.numberOfSides() + ", area = " + this.area;
    }
}

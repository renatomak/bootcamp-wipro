package com.wipro.geometric_shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<GeometricShaps> geometricShaps = new ArrayList<>();
        GeometricShaps cicle = new Cicle(3f, "Preto");
        cicle.area(0.0f, 0.0f);
        geometricShaps.add(cicle);

        GeometricShaps rightTriangle = new RightTriangle("Verde");
        rightTriangle.area(3f, 2f);
        geometricShaps.add(rightTriangle);

        GeometricShaps retangle = new Retangle("Vermelho");
        retangle.area(3f, 5f);
        geometricShaps.add(retangle);

        GeometricShaps square = new Square("Azul");
        square.area(2f, 2f);
        geometricShaps.add(square);

        geometricShaps.forEach(item -> System.out.println(item));


    }
}

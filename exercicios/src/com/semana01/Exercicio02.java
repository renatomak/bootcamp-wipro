package com.semana01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Nome: ");
        String nome = scan.nextLine();

        System.out.println("Notas: ");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float avg = (nota1 + nota2) / 2;

        if(avg >= 6) {
            System.out.println("Aprovado com média " + avg);
        } else {
            System.out.println("Reprovado com média " + avg);
        }

    }
}

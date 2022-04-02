package com.semana01;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();

        int RandomValue = random.nextInt(10);
        System.out.println(RandomValue);

        boolean isFind = false;
        int total = 0;


        do {
            System.out.print("Faça sua escolha: (0 a 10): ");
            int choice = scan.nextInt();
            if(RandomValue == choice) {
                isFind = true;
            }
            total += 1;

        }while(!isFind);
        System.out.println("Você acertou!\nNúmero de tentativas: " + total);
        System.out.println("FIM!!!");

    }
}

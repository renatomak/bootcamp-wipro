package com.wipro;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        String[] produts = {"Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Oleo", "Sabão", "Sal", "Açucar"};
        float[] prices = {4.57f,  3.02f, 9.43f, 3.55f, 6.55f, 4.55f, 7.33f, 1.99f, 3.82f, 4.29f};
        Integer[] invetory = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        Integer[] cart = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        gerarMenu(produts, prices, invetory);
        boolean fecharCarrinho = false;
        short codigoEscolhido = 0;
        int quantity = 0;
        char IS_S_N = 'Z';

        do {
            System.out.println("Digite o código do produto desejado: ");
            codigoEscolhido = scan.nextShort();
            short index = (short) (codigoEscolhido - 1);

            if (codigoEscolhido < 10) {
                showMessager("Insira a quantidade desejada do produto: ");
                quantity = scan.nextInt();

                if (quantity > invetory[index]) {
                    showMessager("Quantidade indisponível em estoque, digite novamente ... ");
                } else {
                    cart[index] = quantity;
                }
            } else {
                showMessager("Produto inexistente. Tente novamente ...");
            }

            showMessager("Você deseja adicionar mais um produto? (S/N): ");
            IS_S_N = scan.next().charAt(0);

            if(IS_S_N == 'N' || IS_S_N == 'n') {
                fecharCarrinho = true;
            }

        }while (!fecharCarrinho);

        for(int i = 0; i < cart.length; i++) {
          System.out.println(cart[i]);
        }
    }

    static void showMessager(String msn) {
        System.out.println(msn);
    }

    static void gerarMenu(String[] produtos, float[] prices, Integer[] inventory) {
        String menuPrincipal = String.format("                       WIPRO STORE\n"
                + "=========================================================================\n"
                + "CÓDIGO           PRODUTO           QTND. PRODUTOS           PREÇO UNIT.");

    System.out.printf(menuPrincipal);
        for(int i = 0; i < produtos.length; i++) {
            int pos = i + 1;
      System.out.println(
          "\n"
              + i+1
              + "\t\t\t\t\t"
              + produtos[i]
              + "\t\t\t\t"
              + inventory[1]
              + "\t\t\t\t\t\t"
              + prices[i]);
        }
    System.out.println( "=========================================================================");
    System.out.print("Olá! ");
    }
}

package com.lucienporto;

import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        System.out.println("Digite o seu saldo: ");
        Scanner scanner = new Scanner(System.in);

        String lerSaldo = scanner.nextLine();
        int saldo = Integer.parseInt(lerSaldo);

        double porcento = saldo * 0.01;

        int novoSaldo = (int) porcento + saldo;

        System.out.println("Seu novo saldo é de: " + novoSaldo);

    }
}

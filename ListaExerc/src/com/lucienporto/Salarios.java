package com.lucienporto;

import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        int salarioMin = 1320;
        System.out.println("Digite o seu salário: ");
        Scanner scanner = new Scanner(System.in);
        String lerSalario = scanner.nextLine();
        int salario = Integer.parseInt(lerSalario);

        int totalMinimos = salario / salarioMin;

        if(totalMinimos == 1) {
            System.out.println("Você recebe " + totalMinimos + " salário mínimo.");
        } else if (totalMinimos < 1) {
            System.out.println("Você recebe menos de um salário mínimo.");
        } else {
            System.out.println("Você recebe " + totalMinimos + " salários mínimos.");
        }

    }
}

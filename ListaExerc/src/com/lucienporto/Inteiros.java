package com.lucienporto;

import java.util.Scanner;

public class Inteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        String lerNum = scanner.nextLine();
        int number = Integer.parseInt(lerNum);
        int antNum = number - 1;
        int posNum = number + 1;

        System.out.println("Seu número: " + number);
        System.out.println("Antecessor: " + antNum);
        System.out.println("Sucessor: " + posNum);
    }
}

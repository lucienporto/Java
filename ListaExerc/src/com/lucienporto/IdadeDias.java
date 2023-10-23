package com.lucienporto;

import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        System.out.println("Digite sua idade em anos:");
        Scanner scanner = new Scanner(System.in);
        String anos = scanner.nextLine();
        int anoTotal = Integer.parseInt(anos);
        System.out.println("Digite quantos meses desde o seu aniversário:");
        String meses = scanner.nextLine();
        int mesTotal = Integer.parseInt(meses);
        System.out.println("Digite quantos dias do mês se passaram:");
        String dias = scanner.nextLine();
        int diaTotal = Integer.parseInt(dias);

        int converteAnos = anoTotal * 365;
        int converteMeses = mesTotal * 30;

        int idade = converteAnos + converteMeses + diaTotal;

        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias = " + idade + " dias.");
    }
}

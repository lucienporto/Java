package br.com.lucienporto;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        String str = scanner.nextLine();

        int number = Integer.parseInt(str);

        int i = 0;
        while(i < 11) {
            int calc = number * i;
            System.out.println(number + "x" + i + "= " + calc);
            i++;
        }
    }
}

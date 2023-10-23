package com.lucienporto;

public class MediasNumbers {
    public static void main(String[] args) {
        double notaA = 8.9;
        double notaB = 7;
        double notaC = 4.5;
        double notaD = 6;

        double mediaA = (notaA + notaB) / 2;
        double mediaB = (notaC + notaD) / 2;
        double somaMedias = mediaA + mediaB;
        double mediaMedias = somaMedias / 2;

        System.out.println("Média de 8.9 e 7 = " + mediaA);
        System.out.println("Média de 4.5 e 6 = " + mediaB);
        System.out.println("Soma das médias = " + somaMedias);
        System.out.println("Média das médias = " + mediaMedias);

    }
}

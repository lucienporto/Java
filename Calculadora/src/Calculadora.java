import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Calculadora Interativa-----");
        System.out.println("Digite um número:");
        String str = scanner.nextLine();
        System.out.println("Digite a operação a ser realizada (+, -, *, /)");
        String operador = scanner.nextLine();
        System.out.println("Digite um número:");
        String str2 = scanner.nextLine();

        int numb1 = Integer.parseInt(str);
        int numb2 = Integer.parseInt(str2);

        if(operador.equals("+")) {
            sum(numb1 , numb2);
        } else if (operador.equals("-")) {
            minus(numb1, numb2);
        } else if (operador.equals("*")) {
            multiply(numb1, numb2);
        } else if (operador.equals("/")) {
            divide(numb1, numb2);
        } else {
            System.out.println("Desculpe, não foi possível realizar o cálculo :(");
        }
    }

    static void sum(int numb1, int numb2) {
        System.out.println(numb1 + numb2);
    }

    static void minus(int numb1, int numb2) {
        System.out.println(numb1 - numb2);
    }

    static void multiply(int numb1, int numb2) {
        System.out.println(numb1 * numb2);
    }

    static void divide(int numb1, int numb2) {
        System.out.println(numb1 / numb2);
    }
}

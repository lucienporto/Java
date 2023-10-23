public class App {

    public static void main(String[] args) {
        //ESCOPO DE VARIÁVEIS

        int x;
        if(true) {
            x = 10; // variável local
        }

        System.out.println(x);

        //Variáveis Imutáveis
        final double pi = 3.14159;

        //pi = 999; -- tentar alterar o valor da variável gera um erro de compilação
        System.out.println(pi);

        //Revisão dos tipos primitivos
        boolean isLogged = true;
        byte a = 64;
        char b = 'b';
        short d = 123;
        int e = 1234567;
        long f = 123456789124567L;
        float g = 12.23f;
        double h = 123.99;

        //Não-primitivos
        String i = "Olá";


    }
}

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência de Fibonacci devem ser gerados: ");
        int termos = entrada.nextInt();
        int fibo = 1;
        int nacci = 0;
        int anterior = 0;
        for (int i = 0; i < termos; i++) {
            anterior = nacci;
            nacci = fibo;
            System.out.println(fibo);
            fibo += anterior;
        }
    }
}

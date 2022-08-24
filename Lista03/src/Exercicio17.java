import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ser testado: ");
        int primo = entrada.nextInt();
        int contador = 0;

        for (int i = primo; i >= 1; i--) {
            if (primo % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}

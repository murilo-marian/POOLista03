import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ser testado: ");
        int primo = entrada.nextInt();
        int contador = 0;
        ArrayList divisores = new ArrayList();

        for (int i = primo; i >= 1; i--) {
            if (primo % i == 0) {
                contador++;
                divisores.add(i);
            }
        }
        if (contador == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
            System.out.println("Porém ele é divisível por: " + divisores);
        }
    }
}

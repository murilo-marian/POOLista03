import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota = -1;
        while (nota < 0 || nota >= 10) {
            System.out.print("Digite uma nota válida (0-10): ");
            nota = entrada.nextInt();
        }
        System.out.println("Valor válido");

        entrada.close();
    }
}

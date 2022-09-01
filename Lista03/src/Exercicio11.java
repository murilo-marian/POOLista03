import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int num;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            num = entrada.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.print("Pares: " + pares);
        System.out.println("Impares " + impares);
        entrada.close();
    }
}

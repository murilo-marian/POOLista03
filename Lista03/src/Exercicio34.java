import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int umQuarto = 0;
        int doisQuarto = 0;
        int tresQuarto = 0;
        int quatroQuarto = 0;
        int num = 0;

        while (num >= 0) {
            System.out.print("Escreva um número (negativo para sair): ");
            num = entrada.nextInt();
            if (num >= 0) {
                if (num <= 25) {
                    umQuarto++;
                } else if (num <= 50) {
                    doisQuarto++;
                } else if (num <= 75) {
                    tresQuarto++;
                } else if (num <= 100) {
                    quatroQuarto++;
                }
            }
        }
        System.out.println("Números entre 0 e 25: " + umQuarto);
        System.out.println("Números entre 26 e 50: " + doisQuarto);
        System.out.println("Números entre 51 e 75: " + tresQuarto);
        System.out.println("Números entre 76 e 100: " + quatroQuarto);
    }
}

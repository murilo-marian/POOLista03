package ExercicioIniciacao.EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a populaçao do País A: ");
        float popA = entrada.nextInt();

        while (popA < 0) {
            System.out.print("Impossível haver população negativo, informe novamente: ");
            popA = entrada.nextInt();
        }

        System.out.print("Informe a taxa de crescimento do Pais A: ");
        float cresceA = entrada.nextFloat();
        System.out.print("Informe a populaçao do País B: ");
        float popB = entrada.nextInt();

        while (popB < 0) {
            System.out.print("Impossível haver população negativo, informe novamente: ");
            popB = entrada.nextInt();
        }

        System.out.println("Informe a taxa de crescimento do Pais B: ");
        float cresceB = entrada.nextFloat();
        int anos = 0;

        if (popA > popB) {
            while (popB <= popA) {
                anos += 1;
                popB = ((popB * cresceB) / 100) + popB;
                popA = ((popA * cresceA) / 100) + popA;
            }
        } else {
            while (popA <= popB) {
                anos += 1;
                popB = ((popB * cresceB) / 100) + popB;
                popA = ((popA * cresceA) / 100) + popA;
            }
        }
        entrada.close();
    }
}

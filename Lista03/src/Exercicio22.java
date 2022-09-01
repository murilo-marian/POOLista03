import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos votantes existem?");
        int votantes = entrada.nextInt();
        int voto = 0;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int nulo = 0;

        for (int i = 1; i <= votantes; i++) {
            System.out.print("Digite o voto do eleitor " + i + ", (1,2 ou 3): ");
            voto = entrada.nextInt();
            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else {
                nulo++;
            }
        }
        System.out.println("Votos por candidato: ");
        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        System.out.println("Candidato 3: " + candidato3);
        System.out.println("Nulo ou branco: " + nulo);

        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("Ganhou o candidato 1");
        } else if (candidato2 > candidato3 && candidato2 > candidato1) {
            System.out.println("Ganhou o candidato 2");
        } else if (candidato3 > candidato1 && candidato3 > candidato2) {
            System.out.println("Ganhou o candidato 3");
        } else {
            System.out.println("Eleição empatada");
        }

        entrada.close();
    }
}

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int voto = 1;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulo = 0;
        int branco = 0;
        int total = 0;
        float totalBranco = 0;
        float totalNulo = 0;

        while (voto != 0) {
            System.out.print("Digite o seu voto: ");
            voto = entrada.nextInt();
            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else if (voto == 4) {
                candidato4++;
            } else if (voto == 5) {
                branco++;
            } else if (voto != 0) {
                nulo++;
            }
        }

        total = candidato4 + candidato1 + candidato2 + candidato3 + nulo + branco;
        totalNulo = ((float) nulo/total)*100f;
        totalBranco = ((float) branco/total)*100f;

        System.out.println("Votos por candidato: ");
        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        System.out.println("Candidato 3: " + candidato3);
        System.out.println("Candidato 4: " + candidato4);
        System.out.println("Bracos: " + branco);
        System.out.println("Porcentagem de Votos em branco: " + totalBranco);
        System.out.println("Nulo: " + nulo);
        System.out.println("Porcentagem de votos nulos: " + totalNulo);

        if (candidato1 > candidato2 && candidato1 > candidato3 && candidato1 > candidato4) {
            System.out.println("Ganhou o candidato 1");
        } else if (candidato2 > candidato3 && candidato2 > candidato1 && candidato2 > candidato4) {
            System.out.println("Ganhou o candidato 2");
        } else if (candidato3 > candidato1 && candidato3 > candidato2 && candidato3 > candidato4) {
            System.out.println("Ganhou o candidato 3");
        } else if (candidato4 > candidato1 && candidato4 > candidato2 && candidato4 > candidato3) {
            System.out.println("Ganhou o candidato 4");
        } else {
            System.out.println("Eleição empatada");
        }

        entrada.close();
    }
}

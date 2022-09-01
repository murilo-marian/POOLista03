import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comp = 10;
        String[] gabarito = new String[comp];
        String[] respostas = new String[comp];
        float maior = 0;
        float menor = 0;
        int alunos = 0;
        float media = 0;
        int usando = 1;
        int nota = 0;
        boolean primeiro = true;

        System.out.println("Digite o gabarito");
        for (int i = 0; i < comp; i++) {
            gabarito[i]  = entrada.nextLine();
        }

        while (usando != 0) {
            alunos++;
            nota = 0;
            for (int i = 0; i < comp; i++) {
                System.out.print("Digite a resposta da pergunta " + (i+1) + ": ");
                respostas[i] = entrada.nextLine();
                if (respostas[i].equals(gabarito[i])) {
                    nota++;
                }
                if (primeiro) {
                    maior = nota;
                    menor = nota;
                    primeiro = false;
                } else if (nota > maior) {
                    maior = nota;
                } else if (nota < menor) {
                    menor = nota;
                }
            }
            media += nota;
            System.out.print("Desaja inserir as respostas de mais algum aluno? (0=Não 1=Sim) ");
            usando = entrada.nextInt();
        }
        media = media/alunos;
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Total de usuários: " + alunos);
        System.out.println("Media das notas: " + media);
    }
}

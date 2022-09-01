import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos turmas tem na escola?");
        int turmas = entrada.nextInt();
        int alunos = 0;
        float media = 0f;

        for (int i = 1; i <= turmas; i++) {
            System.out.print("Digite a quantidade de alunos da turma " + i + ": ");
            alunos = entrada.nextInt();
            while (alunos > 40) {
                System.out.println("Digite a quantidade de alunos da turma " + i + ": ");
                alunos = entrada.nextInt();
            }
            media += alunos;
        }
        media = media / turmas;
        System.out.println("Media de alunos: " + (media));

        entrada.close();
    }
}

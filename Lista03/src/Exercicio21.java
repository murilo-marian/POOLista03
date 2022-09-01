import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos tem na turma?");
        int alunos = entrada.nextInt();
        int idade = 0;
        float media = 0f;

        for (int i = 1; i <= alunos; i++) {
            System.out.print("Digite a idade do aluno " + i + ": ");
            idade = entrada.nextInt();
            media += idade;
        }
        media = media / alunos;
        System.out.println("Media de idade: " + (media));
        if (media < 26) {
            System.out.println("Turma Jovem");
        } else if (media < 60) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

        entrada.close();
    }
}

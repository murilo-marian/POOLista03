import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual será o número a ter sua tabuada mostrada?");
        int num = entrada.nextInt();
        System.out.println("Começar a mostrar a tabuada por qual número?");
        int comeco = entrada.nextInt();
        System.out.println("Terminar em qual número?");
        int fim = entrada.nextInt();
        int troca;

        if (comeco > fim) {
            troca = comeco;
            comeco = fim;
            fim = troca;
        }
        for (int i = comeco; i <= fim; i++) {
            System.out.println(num + " X " + i + " = " + (i * num));
        }

        entrada.close();
    }
}

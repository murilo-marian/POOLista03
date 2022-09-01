import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos CDs existem em sua coleção?");
        int cds = entrada.nextInt();
        int valor = 0;
        float media = 0f;

        for (int i = 1; i <= cds; i++) {
            System.out.print("Digite o valor do CD " + i + ": ");
            valor = entrada.nextInt();
            media += valor;
        }
        System.out.println("O preço total pago pelos CDs é de: " + media);
        media = media / cds;
        System.out.println("Media de preço: " + (media));

        entrada.close();
    }
}

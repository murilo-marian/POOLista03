import java.util.Scanner;

public class Aula0301 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int lin = 5;
        final int col = 5;
        int soma = 0;
        float media = 0;

        int[][] vet = new int[lin][col];

        for (int j = 0; j < lin; j++) {
            for (int i = 0; i < col; i++) {
                System.out.print("Informe o valor " + (j+1) + "," + (i+1) + ": ");
                vet[i][j] = entrada.nextInt();
                soma += vet[i][j];

            }
        }

        for (int j = 0; j < lin; j++) {
            for (int i = 0; i < col; i++) {
                System.out.println(vet[i][j] + ";");
            }
        }

        media = (float) ((float) soma/(lin*col));

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        entrada.close();
    }
}

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int troca;

        if (num1 > num2) {
            troca = num1;
            num1 = num2;
            num2 = troca;
        }

        int soma = 0;
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
            soma += i;
        }
        System.out.println(soma);
        entrada.close();
    }
}

import java.util.Scanner;

public class Exercicio07 {
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

        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);

        }
    }
}

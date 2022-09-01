import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número que deve retornar o seu fatorial");
        int fatorial = entrada.nextInt();
        int limite = fatorial;
        for (int i = 1; i < limite; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
        entrada.close();
    }
}

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos termos você deseja calcular");
        double termos = entrada.nextInt();
        double resultado = 0;

        for (int i = 1; i <= termos; i++) {
            resultado = resultado + (i/(i+1f));
        }
        System.out.println(resultado);
    }
}

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        double base = 38;
        double resultado = 0;

        for (int i = 1; i <= 37; i++) {
            resultado = resultado + ((base-1f)*base)/i;
            base = 38 - i;
        }
        System.out.println(resultado);

    }
}

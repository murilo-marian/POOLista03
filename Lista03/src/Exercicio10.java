import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int base = entrada.nextInt();
        int expoente = entrada.nextInt();
        int resultado = 1;

        for (int i = 0; i < expoente ; i++) {
            resultado = resultado*base;
        }
        System.out.println(base + "^" + expoente + " = " + resultado);
    entrada.close();
    }
}

import java.time.Instant;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o limite do intervalo a ser testado");
        int intervalo = entrada.nextInt();
        int contador = 0;
        ArrayList primos = new ArrayList();

        long msInicial = Instant.now().toEpochMilli();
        for (int j = 1; j < intervalo; j++) {
            for (int i = j; i >= 1; i--) {
                if (j % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                primos.add(j);
            }
            contador = 0;
        }
        long msFinal = Instant.now().toEpochMilli();
        System.out.println(msFinal - msInicial);
        System.out.println(primos);

        entrada.close();
    }
}

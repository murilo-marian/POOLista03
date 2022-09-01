import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valor = -1f;
        float total = 0f;
        int items = 0;
        float pagamento = 0;

        System.out.println("Lojas Tabajara");
        while (valor != 0) {
            items++;
            System.out.print("Produto " + items + ": ");
            valor = entrada.nextFloat();
            total += valor;
        }
        System.out.println("Valor total: " + total);
        while (pagamento < total) {
            System.out.println("Dinheiro: ");
            pagamento = entrada.nextFloat();
        }

        System.out.println("Troco: " + (pagamento - total));

        entrada.close();
    }
}

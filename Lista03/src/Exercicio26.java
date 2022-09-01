import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o preço do pão");
        float pao = entrada.nextFloat();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$" + df.format(pao * i));
        }

        entrada.close();
    }
}

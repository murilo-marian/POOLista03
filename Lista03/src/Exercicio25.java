import java.text.DecimalFormat;

public class Exercicio25 {
    public static void main(String[] args) {
        System.out.println("Lojas Quase Dois - Tabela de Preços");
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$" + df.format(1.99 * i));
        }
    }
}

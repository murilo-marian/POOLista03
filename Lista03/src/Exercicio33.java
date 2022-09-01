import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float divida = 0f;
        float dividaTotal = 0f;
        float juros;
        float valorParcela;
        int parcelas = 1;
        int mult = 3;

        DecimalFormat df = new DecimalFormat();
        df.setMinimumIntegerDigits(3);
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        System.out.print("Valor da dívida: ");
        divida = entrada.nextFloat();

        System.out.print("Valor da Dívida  ");
        System.out.print("Valor dos Juros  ");
        System.out.print("Quant. Parcelas  ");
        System.out.println("Valor da Parcela");
        for (int i = 0; i < 5; i++) {
            juros = (divida * ((10f + (i - 1) * 5) / 100f));
            dividaTotal = divida + juros;
            System.out.print("R$ " + dividaTotal + "              ");
            System.out.print(df.format(juros) + "               ");
            System.out.print(parcelas + "         ");
            valorParcela = dividaTotal / parcelas;
            parcelas = 1 * mult;
            mult += 3;
            System.out.println(valorParcela);
        }
    }
}

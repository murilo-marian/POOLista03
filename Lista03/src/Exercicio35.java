import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float pedidoTotal = 0;
        int pedido = 1;
        int quantia = 0;
        int[] itens = new int[6];
        float[] precos = new float[6];

        System.out.println("Especificação    Código    Preço");
        System.out.println("Cachorro-Quente  100       R$ 1,20");
        System.out.println("Bauru Simples    101       R$ 1,30");
        System.out.println("Bauru com Ovo    102       R$ 1,50");
        System.out.println("Hambúrguer       103       R$ 1,20");
        System.out.println("Cheeseburguer    104       R$ 1,30");
        System.out.println("Refrigerante     105       R$ 1,00");

        while (pedido > 0) {
            System.out.print("Pedido (negativo para sair): ");
            pedido = entrada.nextInt();
            System.out.print("Quantia: ");
            quantia = entrada.nextInt();

            if (pedido == 100) {
                itens[0] += quantia;
                precos[0] = quantia*1.2f;
            } else if (pedido == 101) {
                itens[1] += quantia;
                precos[1] = quantia*1.2f;
            } else if (pedido == 102) {
                itens[2] += quantia;
                precos[2] = quantia*1.2f;
            } else if (pedido == 103) {
                itens[3] += quantia;
                precos[3] = quantia*1.2f;
            } else if (pedido == 104) {
                itens[4] += quantia;
                precos[4] = quantia*1.2f;
            } else if (pedido == 105) {
                itens[5] += quantia;
                precos[5] = quantia*1.2f;
            }
        }

        for (int i = 0; i < 5; i++) {
            pedidoTotal += precos[i];
            if (itens[i] != 0) {
                System.out.print("Item " + (i + 1) + ": " + itens[i] + "   ");
                System.out.println("Preço: " + precos[i]);
            }

        }
        System.out.println("Valor Total: " + pedidoTotal);


    }
}

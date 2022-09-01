import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantas notas são: ");
        float total = entrada.nextFloat();
        float nota = 0;

        for (int i = 0; i < total; i++) {
            System.out.println("Digite a próxima nota");
            nota += entrada.nextInt();
        }
        System.out.println("A média das " + total + " notas é: " + (nota/total));

        entrada.close();
    }
}

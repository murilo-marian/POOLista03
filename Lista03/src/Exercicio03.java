import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = "a";

        while (nome.length() < 3) {
            System.out.println("Digite seu nome (mais que 3 caracteres)");
            nome = entrada.nextLine();
        }
        int idade = -1;
        while (idade < 0 || idade > 150) {
            System.out.println("Digite sua idade");
            idade = entrada.nextInt();
        }

        float sal = 0;
        while (sal <= 0) {
            System.out.println("Digite seu salário");
            sal = entrada.nextFloat();
        }

        entrada.nextLine();
        String sex = "a";
        while (!sex.equals("f") && !sex.equals("m") && !sex.equals("o")) {
            System.out.println("Digite seu sexo (f-feminino, m-masculino, o-outro)");
            sex = entrada.nextLine();
        }

        String civil = "a";
        while (!civil.equals("s") && !civil.equals("c") && !civil.equals("v") && !civil.equals("d")) {
            System.out.println("Digite seu estado civil");
            civil = entrada.nextLine();
        }



    }
}

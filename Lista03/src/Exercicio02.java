import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário");
        String user = entrada.nextLine();
        String senha = user;

        while (senha.equals(user)) {
            System.out.println("Digite uma senha válida, não pode ser igual ao nome de usuário");
            senha = entrada.nextLine();
        }

        entrada.close();
    }
}

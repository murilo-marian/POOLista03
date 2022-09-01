import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float altura = 0;
        float maisAlto = 0;
        float maisBaixo = 0;
        int codAltura = 0;
        int codBaixura = 0;
        float mediaAltura = 0;
        final int total = 10;
        boolean primeiro = true;


        for (int i = 0; i < total; i++) {
            System.out.print("Digite o código do aluno: ");
            int codigo = entrada.nextInt();
            System.out.print("Altura: ");
            altura = entrada.nextFloat();
            mediaAltura += altura;
            if (primeiro) {
                maisBaixo = altura;
                maisAlto = altura;
                codAltura = codigo;
                codBaixura = codigo;
                primeiro = false;
            } else {
                if (altura < maisBaixo) {
                    maisBaixo = altura;
                    codBaixura = codigo;
                }
                if (altura > maisAlto) {
                    maisAlto = altura;
                    codAltura = codigo;
                }
            }
        }
        System.out.println("Código do aluno mais alto: " + codAltura);
        System.out.println("Altura do aluno mais alto: " + maisAlto);
        System.out.println("Código do aluno mais baixo: " + codBaixura);
        System.out.println("Altura do aluno mais baixo: " + maisBaixo);
        System.out.println("Media de altura: " + (mediaAltura/total));

        entrada.close();
    }
}

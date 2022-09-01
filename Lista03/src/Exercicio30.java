import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float peso = 0;
        float menorPeso = 0;
        float maiorPeso = 0;
        int codPesado = 0;
        int codLeve = 0;
        float altura = 0;
        float maisAlto = 0;
        float maisBaixo = 0;
        int codAltura = 0;
        int codBaixura = 0;
        float mediaAltura = 0;
        float mediaPeso = 0;
        int total = 0;
        boolean primeiro = true;

        System.out.print("Digite o código do cliente: ");
        int codigo = entrada.nextInt();
        while (codigo != 0) {
            total++;
            System.out.print("Peso: ");
            peso = entrada.nextFloat();
            System.out.print("Altura: ");
            altura = entrada.nextFloat();
            mediaAltura += altura;
            mediaPeso += peso;
            if (primeiro) {
                maisBaixo = altura;
                maisAlto = altura;
                codAltura = codigo;
                codBaixura = codigo;
                menorPeso = peso;
                maiorPeso = peso;
                codLeve = codigo;
                codPesado = codigo;
                primeiro = false;
            }

            if (peso < menorPeso) {
                menorPeso = peso;
                codLeve = codigo;
            } else if (peso > maiorPeso) {
                maiorPeso = peso;
                codPesado = codigo;
            }

            if (altura < maisBaixo) {
                maisBaixo = altura;
                codBaixura = codigo;
            } else if (altura > maisAlto) {
                maisAlto = altura;
                codAltura = codigo;
            }

            System.out.print("Digite o código do cliente: ");
            codigo = entrada.nextInt();
        }
        System.out.println("Código do cliente mais alto: " + codAltura);
        System.out.println("Altura do cliente mais alto: " + maisAlto);
        System.out.println("Código do cliente mais baixo: " + codBaixura);
        System.out.println("Altura do cliente mais baixo: " + maisBaixo);
        System.out.println("Codigo do cliente mais pesado: " + codPesado);
        System.out.println("Peso do cliente mais pesado: " + maiorPeso);
        System.out.println("Codigo do cliente mais leve: " + codLeve);
        System.out.println("Peso do cliente mais leve: " + menorPeso);
        System.out.println("Media de peso: " + (mediaPeso/total));
        System.out.println("Media de altura: " + (mediaAltura/total));

        entrada.close();
    }
}

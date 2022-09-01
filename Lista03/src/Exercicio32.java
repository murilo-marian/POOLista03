import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quant = 5;
        int[] codigo = new int[quant];
        int[] passeio = new int[quant];
        int[] acidentes = new int[quant];
        int codMaior;
        int maior;
        int codMenor;
        int menor;
        float media = 0;
        float mediaAcidente = 0;
        int contador = 0;

        for (int i = 0; i < quant; i++) {
            System.out.print("Código da cidade: ");
            codigo[i] = entrada.nextInt();
            System.out.println("Número de veículos de passeio");
            passeio[i] = entrada.nextInt();
            System.out.println("Número de acidentes: ");
            acidentes[i] = entrada.nextInt();
        }

        codMaior = codigo[0];
        maior = acidentes[0];
        codMenor = codigo[0];
        menor = acidentes[0];

        for (int i = 1; i < quant ; i++) {
            if (acidentes[i] > maior) {
                maior = acidentes[i];
                codMaior = codigo[i];
            } else if (acidentes[i] < menor) {
                menor = acidentes[i];
                codMenor = codigo[i];
            }
        }

        for (int i = 0; i < quant; i++) {
            media += passeio[i];
            if (passeio[i] < 2000) {
                contador++;
                mediaAcidente += acidentes[i];
            }
        }
        media = media/quant;
        mediaAcidente = mediaAcidente/contador;

        System.out.println("Cidade com o maior número de acidentes: " + codMaior);
        System.out.println("Número de acidentes: " + maior);
        System.out.println("Cidade com o menor número de acidentes: " + codMenor);
        System.out.println("Número de acidentes: " + menor);
        System.out.println("Media de veículos nas cidades: " + media);
        System.out.println("Media de acidentes em cidades com menos de 2000 carros: " + mediaAcidente);
    }
}

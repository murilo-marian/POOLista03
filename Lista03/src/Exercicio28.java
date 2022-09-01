import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float temperatura = 0;
        float minTemp = 0;
        float maxTemp = 0;
        float medTemp = 0f;
        boolean primeiro = true;

        System.out.println("Quantas temperaturas devem ser lidas?");
        int numTemp = entrada.nextInt();
        for (int i = 0; i < numTemp; i++) {
            System.out.println("Escreva uma temperatura");
            temperatura = entrada.nextFloat();
            medTemp += temperatura;
            if (primeiro) {
                minTemp = temperatura;
                maxTemp = temperatura;
                primeiro = false;
            } else if (minTemp > temperatura) {
                minTemp = temperatura;
            } else if (maxTemp < temperatura) {
                maxTemp = temperatura;
            }
        }
        System.out.println("Menor temperatura: " + minTemp);
        System.out.println("Maior temperatura: " + maxTemp);
        System.out.println(medTemp);
        System.out.println(numTemp);
        System.out.println("Temperatura media: " + (medTemp/numTemp));

        entrada.close();
    }
}

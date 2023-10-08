package arrays;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de posições: ");
        int n = input.nextInt();
        double[] vet = new double[n];
        double media=0;
        for(int i=0;i<n;i++) {
            System.out.println("Digite o " + (i+1) + " valor");
            vet[i] = input.nextDouble();
            media += vet[i];
        }
        for(int i=0;i<n;i++) {
            System.out.println("Valor " + (i+1) + ": " + vet[i]);
        }
        media = media / n;
        System.out.println("A media das alturas é de: " + media);
        input.close();
    }
}

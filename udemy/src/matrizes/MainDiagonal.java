package matrizes;

import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual será o tamanho da matriz?");
        int size = input.nextInt();
        int [][]matrix = new int[size][size];
        int i, j;
        for(i=0;i<size;i++) {
            for(j=0;j<size;j++) {
                System.out.println("Digite o " + (i+1) + " valor da " + (j+1) + " coluna.");
                matrix[i][j] = input.nextInt();
            }
        }

        for(i=0;i<matrix.length;i++) {
            for(j=0;j<matrix[i].length;j++) {
                System.out.print("["+matrix[i][j] + "] \t");
            }
            System.out.println();
        }


        System.out.print("\nA diagonal principal é composta pelos numeros: ");
        for(i=0;i<size;i++) {
            for(j=0;j<size;j++) {
                if(i==j){ 
                    System.out.print("["+matrix[i][j] + "] \t");
                }
            }
        }

        System.out.print("\nos numeros negativos presentes sao: ");
        for(i=0;i<size;i++) {
            for(j=0;j<size;j++) {
                if(matrix[i][j] < 0){ 
                    System.out.print("["+matrix[i][j] + "] \t");
                }
            }
        }
    }
}

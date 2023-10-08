package arrays.aluno;

import java.util.Scanner;

public class PassedStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos alunos serão adicionados?");
        int n = input.nextInt();
        
        Student[] student = new Student[n];

        for(int i=0;i<n;i++) {
            input.nextLine();
            System.out.println("Nome do aluno:");
            String name = input.nextLine();
            
            System.out.println("Primeira nota: ");
            double grade1 = input.nextDouble();

            System.out.println("Segunda nota: ");
            double grade2 = input.nextDouble();

            double totalGrade = (grade1 + grade2) / 2;
            
            student[i] = new Student(name, totalGrade);
            System.out.println("Aluno adicionado.");
        }

        System.out.println("Aprovados: ");
        for(int i=0;i<n;i++) {
            if(student[i].getTotalGrade() >= 6.0) {
                System.out.println(student[i].getName());
            }
        }
    }
}

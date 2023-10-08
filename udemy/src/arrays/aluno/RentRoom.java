package arrays.aluno;

import java.util.Scanner;

public class RentRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Room[] room = new Room[10];
        System.out.println("Quantos estudantes serão adicionados?(Max: 10)");
        int n = input.nextInt();

        for(int i=0;i<n;i++) {
            input.nextLine();
            System.out.println("Alugando um quarto.");
            
            System.out.println("Nome: ");
            String name = input.nextLine();
            
            System.out.println("Email: ");
            String email = input.nextLine();

            int number;
            do {
                System.out.println("Qual quarto será alugado?");
                number = input.nextInt();
                if(room[number] != null) {
                    System.out.println("Quarto ocupado.");
                    break;
                } else {
                    System.out.println("Quarto alugado com sucesso.");
                    Student student = new Student(name, email);
                    room[number] = new Room(student, number);
                }
            } while(room[number] == null);
        }

        for(int i=0;i<10;i++) {
            System.out.println("Quarto " + (i+1));
            if(room[i] == null) {
                System.out.println("Não alugado.");
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Nome: " + room[i].getStudent().getName());
                System.out.println("Email: " + room[i].getStudent().getEmail());
                System.out.println("--------------------------------------");
            }
        }
        input.close();
    }
}

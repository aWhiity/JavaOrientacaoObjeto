package arraylistas;

import java.util.Scanner;

public class AddPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas pessoas serão adicionadas?");
        int n = input.nextInt();

        Person[] person = new Person[n];
        double percentage=0;

        for(int i=0; i<n; i++) {
            input.nextLine();
            System.out.println("Nome: ");
            String name = input.nextLine();

            System.out.println("Idade: ");
            int age = input.nextInt();
            
            System.out.println("Altura: ");
            double height = input.nextDouble();
            
            person[i] = new Person(name, age, height);
            System.out.println(person[i].getName() + " foi adicionado(a) com sucesso!.");
            
            if(age<=16) {
                percentage++;
                
            }
        }

        for(int i=0;i<n;i++) {
            System.out.println("-------------------------------");
            System.out.println("Nome: " + person[i].getName());
            System.out.println("Idade: " + person[i].getAge());
            System.out.println("Altura: " + person[i].getHeight());
            System.out.println("-------------------------------");
        }

        percentage = percentage / n * 100;
        System.out.println("A porcentagem de pessoas com menos de 16 anos é de: " + percentage + "%");
        System.out.println("LISTA: ");
        for(int i=0;i<n;i++) {
            if(person[i].getAge() <= 16) {
                System.out.println(person[i].getName());
            }
        }

        input.close();
    }
}

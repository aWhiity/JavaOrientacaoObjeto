package arrays.pessoa;

import java.util.Scanner;

public class AgeComparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas pessoas serão adicionadas?");
        int n = input.nextInt();

        Person[] person = new Person[n];
        int maxAge=0;
        String older=" ";

        for(int i=0; i<n; i++) {
            input.nextLine();
            System.out.println("Nome: ");
            String name = input.nextLine();

            System.out.println("Idade: ");
            int age = input.nextInt();
            
            person[i] = new Person(name, age);
            System.out.println(person[i].getName() + " foi adicionado(a) com sucesso!.");
            
        }

        for(int i=0;i<n;i++) {
            if(person[i].getAge() > maxAge) {
                maxAge = person[i].getAge();
                older = person[i].getName();
            }
        }

        System.out.println("O mais velho é: " + older + ", com " + maxAge + " anos.");

        input.close();
    }
    
}

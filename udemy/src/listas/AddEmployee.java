package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos funcionários serão adicionados?");
        int n = input.nextInt();
        
        List<Employee> employee = new ArrayList<>();

        for(int i=0;i<n;i++) {
            input.nextLine();
            System.out.println("Nome: ");
            String name = input.nextLine();
            
            System.out.println("ID: ");
            int id = input.nextInt();
            Employee validateId = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if(validateId != null) {
                System.out.println("Esse ID já existe.");
                return;
            }

            System.out.println("Salário: ");
            double salary = input.nextDouble();

            employee.add(new Employee(id, salary, name));
        }

        System.out.println("Digite o ID");
        int id = input.nextInt();
        Employee idEmployee = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(idEmployee == null) {
            System.out.println("ID não encontrado.");
        } else {
            System.out.println("Em quantos porcentos o salário será aumentado?");
            double percentage = input.nextDouble();
            idEmployee.modifySalary(percentage);
        }
        for(Employee i : employee) {
            System.out.println("Funcionario");
            System.out.println(i.getName());
            System.out.println(i.getId());
            System.out.println(i.getSalary());
            System.out.println("----------------------------------");
        }
        input.close();
    }
}

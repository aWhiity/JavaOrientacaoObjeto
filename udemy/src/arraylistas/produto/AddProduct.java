package arraylistas.produto;

import java.util.Scanner;

public class AddProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos: ");
        int n = input.nextInt();
        Product[] product = new Product[n];
        double averagePrice=0;
        for(int i=0;i<n;i++) {
            System.out.println("Nome: ");
            input.nextLine();
            String name = input.nextLine();
            
            System.out.println("Preço do(a) " + name);
            double price = input.nextDouble();
            product[i] = new Product(name, price);
            averagePrice += price;
        }
        
        System.out.println("PRODUTOS");
        for(int i=0;i<n;i++) {
            System.out.println("Nome: " + product[i].getName());
            System.out.println("Preço: " + product[i].getPrice());
            System.out.println("-------------------------------");
        }

        System.out.println("A média do preço dos produtos é de: " + (averagePrice / n));

        input.close();
    }
}

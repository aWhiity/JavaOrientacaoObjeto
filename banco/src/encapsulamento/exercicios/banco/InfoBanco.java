package encapsulamento.exercicios.banco;

import java.util.Scanner;

public class InfoBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da conta.");
        Conta conta = new Conta(input.nextInt());
        input.nextLine();
        System.out.println("Digite o nome da conta.");
        conta.setTitular(input.nextLine());
        System.out.println("Digite 1 se você deseja depositar um valor inicial.\n\tCaso não queira, digite qualquer outro número.");
        int escolha = input.nextInt();
        input.nextLine();
        if(escolha==1) {
            System.out.println("Qual o valor a ser depositado?(formato: 00,00)");
            conta.depositar(input.nextFloat());
            System.out.println("Dados atuais:");
            System.out.println("Nome: " + conta.getTitular());
            System.out.println("Número: " + conta.getNumero());
            System.out.println("Saldo: " + conta.getSaldo());
        }
        System.out.println("Digite o valor do saque: ");
        conta.sacar(input.nextFloat());
        System.out.println(conta);
        input.close();
    }
}

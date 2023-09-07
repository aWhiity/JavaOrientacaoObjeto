public class CriaConta {
    public static void main(String[] args) {
        Conta conta = new Conta(23, 123456, "Mateus");
        Conta conta2 = new Conta(45, 2345, "Maria");
        System.out.println(conta);
        conta.deposita(300);
        System.out.println(conta.saldo);
        conta.saca(13.50);
        System.out.println(conta.saldo);
        conta.transfere(20, conta2);
        System.out.println("Saldo "+ conta.titular + ": " + conta.saldo + "\nSaldo "+ conta2.titular + ": " + conta2.saldo);
    }

}

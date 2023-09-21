package composto;
public class CriaConta {
    public static void main(String[] args) {
        Conta conta = new Conta(23, 123456);
        Conta conta2 = new Conta(45, 2345);
        System.out.println(conta);
        conta.deposita(300);
        System.out.println(conta.getSaldo());
        conta.saca(13.50);
        System.out.println(conta.getSaldo());
        conta.transfere(20, conta2);
        System.out.println("Saldo Mateus: " + conta.getSaldo() + "\nSaldo Maria: " + conta2.getSaldo());
    }

}

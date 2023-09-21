package encapsulamento;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(324232,324);
        conta.setAgencia(-390);
        System.out.println(Conta.getTotal());
        //teste
    }
}

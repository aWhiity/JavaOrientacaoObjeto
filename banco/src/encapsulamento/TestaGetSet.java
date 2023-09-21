package encapsulamento;

public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(2345223, 23123);
        Cliente jose = new Cliente();
        conta.setNumero(123);
        conta.setTitular(jose);
        System.out.println(conta);
        jose.setNome("jose");
        System.out.println(conta.getTitular().getNome());
        System.out.println(jose.getNome());
        System.out.println(conta);
    }
}

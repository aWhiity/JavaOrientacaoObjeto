package encapsulamento.exercicios.banco;
/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
L
Importante: uma vez que uma conta bancária, foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação. */
public class Conta {
    private int numero;
    private String titular;
    private float saldo;

    public Conta(int numero) {
        this.numero = numero;
    }

    public void depositar(float valor) {
        if(valor > 0) {
            this.saldo+=valor;
            return;
        } else {
            System.out.println("Não é possível depositar um valor negativo.");
        }
    }

    public void sacar(float valor) {
        this.saldo-=valor+5;
        System.out.println(this.saldo);
    
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.titular + "\nNúmero: " + this.numero + "\nSaldo: " + this.saldo;
    }
    
}
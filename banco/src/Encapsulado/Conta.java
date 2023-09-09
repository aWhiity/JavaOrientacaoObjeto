package Encapsulado;
public class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;
    private static int total;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        System.out.println("Valor invalido.");
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Conta(int agencia, int numero, Cliente titular, double saldo) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int agencia, int numero, Cliente titular) {
        this(agencia, numero, titular, 0);
    }

    public Conta(int agencia, int numero) {
        this(agencia, numero, null, 0);
    }
    

    public int getNumero() {
        return this.numero;
    }
    
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setNumero(int numero) {
        if(numero<=0) {
            System.out.println("Não é possível colocar um número menor ou igual a 0.");
            return;
        }
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        if(agencia<=0) {
            System.out.println("Não é possível adicionar uma agencia menor ou igual a 0.");
            return;
        }
        this.agencia = agencia;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular.getNome() + "]";
    }

}

public class Conta {
    int agencia;
    int numero;
    Cliente titular;
    double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
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

    public Conta(int agencia, int numero, Cliente titular, double saldo) {
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

    @Override
    public String toString() {
        return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular + "]";
    }

}

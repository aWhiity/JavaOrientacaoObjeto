package composto;
public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta1 = new Conta(123, 14);
        conta1.titular = new Cliente("Jose", "00", "123455"); 
        conta1.deposita(100);
        conta1.saca(10);
        System.out.println(conta1.getSaldo());
    }
}

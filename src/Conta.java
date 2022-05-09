public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean deposita(double saldo) {
        if(saldo<=0){
            return false;
        }
        this.saldo += saldo;
        return true;
    }
    
    public boolean saca(double saldo) {
        if(saldo>this.saldo||saldo<=0){
            return false;
        }
        this.saldo -= saldo;
        return true;
    }
    
    public boolean transfere(double valor, Conta conta){
        if(valor>this.saldo||valor<=0){
            return false;
        }
        this.saca(valor);
        conta.deposita(valor);
        return true;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
   
   public Cliente getTitular(){
       return titular;
   }
}

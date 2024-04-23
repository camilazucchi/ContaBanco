package entities;

public class Conta {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Olá " + getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + getAgencia() + ", o número da sua conta é " + getNumero() + " e seu saldo de R$" + getSaldo() +
                " já está disponível para saque.";
    }
}
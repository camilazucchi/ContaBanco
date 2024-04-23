package application;

import entities.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Olá! Por favor, digite o número da sua conta: ");
        int numero = input.nextInt();
        input.nextLine();

        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = input.nextLine();

        System.out.println("Por favor, insira o seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.println("Por fim, digite o seu saldo: ");
        double saldo = input.nextDouble();

        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);
        System.out.println(conta);

    }
}
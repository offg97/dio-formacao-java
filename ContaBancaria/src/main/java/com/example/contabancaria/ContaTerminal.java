package  com.example.contabancaria;

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String acount;
        String agency;
        String client;
        double balance;


        System.out.println("Por favor, digite o número da Agência:");
        agency = scanner.nextLine();

        System.out.println("Por favor, digita o número da Conta");
        acount = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        client = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        balance = scanner.nextDouble();

        System.out.println("Olá " + client + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency +
                ", conta " + acount + " e seu saldo " + balance + " já está disponível para saque");

    }
}
    
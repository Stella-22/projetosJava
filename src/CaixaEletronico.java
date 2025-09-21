// Pedir ao usuario um valor que ele queira sacar e verificar se há saldo suficiente em seguida imprimir para ele

import java.util.Scanner;

import static java.lang.String.format; //pq usei essa expressão? pq ele faz o format funcionar

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boa noite caro cliente!");

        double saldo = 1000.53; // Saldo inicial fictício - posso colocar qualquer valor positivo ou negativo

        System.out.println("Seu saldo atual é de: R$ " + format("%.2f",saldo) + " reais");
        System.out.print("Digite o valor que deseja sacar: ");
        int valorSaque = scanner.nextInt();//o numero precisa vir inteiro do teclado

        if (valorSaque <= saldo) {
            double saldoFinal= saldo - valorSaque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu novo saldo é de: R$ " + format("%.2f", saldoFinal) + " reais");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }

        scanner.close();
    }
}

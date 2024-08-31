package conta_banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Declaração das variáveis
        Integer Numero;
        String Agencia;
        String nomeCliente;
        double Saldo;

        // Declaração do objeto sc para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Capturar o número da agência
        System.out.print("Digite o número da sua agência: ");
        Numero = sc.nextInt();

        System.out.print("Digite o nome da sua agência: ");
        Agencia = sc.next();

        System.out.print("Digite o seu nome completo: ");
        nomeCliente = sc.next();

        System.out.print("Digite o saldo da sua conta: ");
        Saldo = sc.nextDouble();

        // Mostra os dados cadastrados no Banco
        System.out.print("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + Agencia +
                ", conta " + Numero +
                " e seu saldo " + Saldo +
                " já está disponível para saque.");
    }
}

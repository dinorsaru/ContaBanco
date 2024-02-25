import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Por favor, digite o seu Nome: ");
        String nomeCliente = dados.nextLine();

        System.out.println("Por favor, digite o número da Agencia: ");
        String numeroAgencia = dados.nextLine();

        System.out.println("Por favor, insira o valor para deposito: ");
        double saldo = dados.nextDouble();

        int numeroConta = 1021;

        System.out.print("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + " e a conta " + numeroConta + ". O seu saldo é: " + saldo + " e já está disponível para saque.");
    }
}
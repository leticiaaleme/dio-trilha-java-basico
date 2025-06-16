import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco DIO!");
        System.out.println("Por favor, informe o seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Número da sua agência:");
        String agencia = scanner.nextLine();
        System.out.println("Número da sua conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");
    }
}
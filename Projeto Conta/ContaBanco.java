import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        System.out.println("Digite o numero da conta");
        int numeroConta = sd.nextInt();

        sd.nextLine();

        System.out.println("Digite a sua Agência");
        String numeroAgencia = sd.nextLine();

        System.out.println("Digite o nome do Clinete");
        String nomeCliente = sd.nextLine();

        System.out.println("Digite o seu saldo");
        double saldo = sd.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", nomeCliente, numeroAgencia, numeroConta, saldo);
    }
}

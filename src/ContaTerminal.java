import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        String saida = "Olá ";
        saida = saida.concat(nomeCliente);
        saida = saida.concat(", obrigado por criar uma conta em nosso banco, sua agência é ");
        saida = saida.concat(agencia);
        saida = saida.concat(", conta "+numero);
        saida = saida.concat(" e seu saldo "+saldo);
        saida = saida.concat(" já está disponível para saque.");

        System.out.println(saida);
        scanner.close();
    }
}

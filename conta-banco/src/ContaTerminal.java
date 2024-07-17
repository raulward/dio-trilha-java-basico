
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agencia: ");
        String agenceNumber = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite o saldo bancário: ");
        float salary = scanner.nextFloat();

        String message = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", name, agenceNumber, accountNumber, salary);

        System.out.println(message);

        
    }
}

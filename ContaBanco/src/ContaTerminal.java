import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner;
        // Exibir as mensagens para o nosso usuario;
        // Obter pelo Scanner as informações digitadas pelo usuario no terminal;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo atual: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem de conta criada;
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}

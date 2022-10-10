import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        //Obter pela scanner os valores digitados no terminal
        System.out.println("Digite o numero da conta: ");
        int numeroConta = leitor.nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = leitor.next();

        System.out.println("Digite o nome do cliente: ");
        String nome = leitor.next();

        System.out.println("Deposito: ");
        double saldo = leitor.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Ola "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo);

    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, informe o seu nome!: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta!: ");
        int conta = sc.nextInt();

        double saldo = 237.48;

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + conta + " e seu saldo de $"+ saldo + " já está disponível para saque.");

        //Fechar scanner
        sc.close();
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: conhecer e importar a classe Scanner;
        // exibir as msg pro usuario
        // obter pelo scanner os valores pelo terminal
        // exibir msg da conta

        Scanner sc = new Scanner (System.in);

       
        
        
        

        System.out.println("Digite seu nome: ");
        String cliente = sc.nextLine();

        System.out.println("Digite o numero da agência ");
        String agencia = sc.nextLine();

        System.out.println("Digite sua conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + cliente + ", obrigado por criar uma conta no nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de " + saldo + " disponivel para saque"  );
        sc.close();
    }
}

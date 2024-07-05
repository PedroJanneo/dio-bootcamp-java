package BancoDigital;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "";
        String nome = "";
        Cliente cliente = null;
        Conta conta = null;

        System.out.println("Bem vindo ao banco XT ");

        // Loop para perguntar se o usuário quer abrir uma conta
        while (!resposta.equals("S") && !resposta.equals("N")) {
            System.out.println("Gostaria de abrir uma conta conosco? S/N");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Okay, até a próxima");
                sc.close();
                return; // Encerra o programa se o usuário não quiser abrir conta
            } else if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Seja bem vindo ao nosso banco");
            } else {
                System.out.println("Não entendi sua resposta");
            }
        }

        // Pergunta e armazena o nome do cliente
        System.out.println("Digite seu nome: ");
       nome = sc.nextLine();
        cliente = new Cliente( nome);

        // Cria uma conta para o cliente
        System.out.println("Conta Corrente (CC) ou Conta Poupança (CP)?");
        String tipoConta = sc.nextLine();

        if (tipoConta.equalsIgnoreCase("CC")) {
            conta = new ContaCorrente(cliente);
        } else if (tipoConta.equalsIgnoreCase("CP")) {
            conta = new ContaPoupanca(cliente);
        } else {
            System.out.println("Tipo de conta inválido. Encerrando programa.");
            sc.close();
            return;
        }

        // Loop para operações na conta
        while (true) {
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Ver Saldo");
            System.out.println("5. Sair");

            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha pendente após nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para depositar:");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor para sacar:");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Digite o valor para transferir:");
                    double valorTransferencia = sc.nextDouble();
                    sc.nextLine(); // Consumir a quebra de linha pendente após nextDouble()

                    System.out.println("Digite o nome do destinatário:");
                    String nomeDestinatario = sc.nextLine();
                    Cliente destinatario = new Cliente(nomeDestinatario);

                    // Simulando transferência para outra conta
                    Conta contaDestinatario = new ContaPoupanca(destinatario); // Suponha Conta Poupança para o destinatário
                    conta.transferir(contaDestinatario, valorTransferencia);
                    break;
                case 4:
                    conta.imprimirExtrato();
                    break;
                case 5:
                    System.out.println("Obrigado por usar nosso banco. Até a próxima!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

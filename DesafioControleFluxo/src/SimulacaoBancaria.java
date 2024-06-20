import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
         
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   double valor1 = scanner.nextDouble();
                   saldo += valor1;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    
                    double valor2 = scanner.nextDouble();  // Alterado para double
                    if (valor2 < saldo) {
                        saldo -= valor2;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                System.out.println("Saldo atual: "+  saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

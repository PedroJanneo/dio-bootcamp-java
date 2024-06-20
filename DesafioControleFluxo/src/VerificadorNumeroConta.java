// import java.util.Scanner;

// public class VerificadorNumeroConta {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         try {
//             System.out.print("Digite o número da conta bancária: ");
//             String numeroConta = scanner.nextLine().trim(); // Lê e remove espaços em branco extras
            
//             verificarNumeroConta(numeroConta);

//             // Se nenhum erro foi lançado, o número da conta é válido
//             System.out.println("Número de conta válido.");
//         } catch (IllegalArgumentException e) {
//             // Captura a exceção IllegalArgumentException e imprime a mensagem de erro
//             System.out.println("Erro: " + e.getMessage());
//         } finally {
//             // Fechar o scanner para evitar vazamentos de recursos
//             scanner.close();
//         }
//     }

//     public static void verificarNumeroConta(String numeroConta) {
//         // Verifica se o número da conta tem exatamente 8 dígitos
//         if (numeroConta.length() != 8) {
//             throw new IllegalArgumentException();
//         }
        
//         // Verifica se o número da conta contém apenas dígitos
//         if (!numeroConta.matches("\\d{8}")) {
//             throw new IllegalArgumentException();
//         }
//     }
// }

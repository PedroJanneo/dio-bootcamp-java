import java.util.Scanner;

public class Aboutme {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = sc.nextLine();

        System.out.println("Digite sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Digite sua idade ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura ");
        double altura = sc.nextDouble();

        System.out.println("Me chamo " + nome + " " +sobrenome + " tenho " + idade + " e " + altura + "cm");


       sc.close();
    }
}

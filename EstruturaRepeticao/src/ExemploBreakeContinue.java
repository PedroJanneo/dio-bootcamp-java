public class ExemploBreakeContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) 
                break; // so faz a ação do if quando a exmpressao for V
                            // esse para o for qnd chegar no if
                System.out.println(i); //acao do if
            
        }
        System.out.println("teste");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) 
                continue; // so vai fazer a ação do if (ate 3) quando a exmpressao for V
                            // esse 'ignora' o if e continua ate chegar na condição do for
                System.out.println(i); //acao do if
            
        }
        System.out.println("teste2");
    }
}

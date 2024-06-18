public class condicoes {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
 
        if(valorSolicitado < saldo) // uso de if
         saldo -= valorSolicitado;
 
         System.out.println(saldo);


         int nota = 2;

         if (nota > 6){ //uso do if e else
            System.out.println("aprovado");
         } else{
            System.out.println("reprovado");
         }

         int notaD = 5;

         if ( notaD >=7 ){ // estrutura if / elif / else 
            System.out.println("Aprovado");
         } else if ( notaD >=5 && notaD<7){
            System.out.println("Recuperação");
         } else {
            System.out.println("reprovado");
         }
    }
}

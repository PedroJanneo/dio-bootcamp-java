public class Operaores {
    public static void main(String[] args) {
        

        int n = 5;

       System.out.println( n == 5);

       n = 5;
    //    n += 2;
    //    System.out.println(n);

    //    n -= 2;
    //    System.out.println(n);

       int m = 4;

        if ( n == m){
            System.out.println("V");
        } else {
            System.out.println("F");
        }

        String resultado = n==m ? "verdadeiro" : "falso"; // operador ternario (forma resumida do if/else)
        System.out.println(resultado);                      //primeira condicao V/if, segunda F/else
    }
}

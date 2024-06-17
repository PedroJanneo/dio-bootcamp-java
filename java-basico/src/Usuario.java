public class Usuario {
    public static void main(String[] args) {
        

        Metodos metodos = new Metodos(); // orientação objeto

        System.out.println("Ligada " + metodos.ligada);
        System.out.println("Canal " + metodos.canal); // metodos = objeto ; canal = parametro
        System.out.println("Volume " +metodos.volume);

        metodos.ligar();
        System.out.println("Novo stts -> TVligada ? " + metodos.ligada);

        metodos.desligar();
        System.out.println("Novo stts -> TVligada ? " + metodos.ligada);

        metodos.aumentarVolume();
        System.out.println("Novo volume: " + metodos.volume);

        metodos.diminuirVolume();
        System.out.println("Novo volume: " + metodos.volume);

        System.out.println("canal atual: "+metodos.canal);
        metodos.mudarCanal(13);
        System.out.println("cana atual " + metodos.canal);
        metodos.descerCanal(); 
        metodos.subirCanal(); 
      
    }
}

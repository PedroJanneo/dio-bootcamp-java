package POO;

public class Carro extends Veiculos {

    
    public void ligar(){ 
        conferindoCambio();  //chamando os metodos aq pois estao privados
        conferindoCombustivel();  //chamando os metodos aq pois estao privados
        System.out.println("Carro LIGADO");
    }

    private void conferindoCombustivel(){
        System.out.println("Conferindo combustive...");
    }

    private void conferindoCambio(){
        System.out.println("conferindo cambio...");
    }

    
}

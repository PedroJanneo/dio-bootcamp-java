package POO;

public class Autodromo {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.setChassi("1111");
        // carro.ligar();

        Moto moto = new Moto();
        moto.setChassi("1090");
        moto.ligar();

        Veiculos coringa = carro;
        coringa.ligar();
    }
  
}

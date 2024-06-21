package POO.Interface.equipamentos.estabelecimento;

import POO.Interface.equipamentos.impressora.Laserjet;
import POO.Interface.equipamentos.impressora.Impressora;


public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Laserjet();
        impressora.imprimir();
    }
}

package POO.Interface.equipamentos.estabelecimento;

// import POO.Interface.equipamentos.impressora.Laserjet;
import POO.Interface.equipamentos.multi.EquipamentoMultifuncional;
import POO.Interface.equipamentos.Digitalizadora.Digitalizadora;
import POO.Interface.equipamentos.copiadora.Copiadora;
import POO.Interface.equipamentos.impressora.Impressora;


public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora.imprimir();
        digitalizadora.digitalizar();;
        copiadora.copiar();
    }
}

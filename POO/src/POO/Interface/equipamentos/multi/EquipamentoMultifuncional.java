package POO.Interface.equipamentos.multi;

import POO.Interface.equipamentos.Digitalizadora.Digitalizadora;
import POO.Interface.equipamentos.copiadora.Copiadora;
import POO.Interface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

   
    public void copiar() {
       System.out.println("COPIANDO via equipamento");
    }

  
    public void digitalizar() {
       System.out.println("DIGITALIZANDO via equipamento");
    }


    
    public void imprimir() {
        System.out.println("IMPRIMINDO via equipamento");
    }
    
}
// ua classe representa varias outras classes, cria uma interface
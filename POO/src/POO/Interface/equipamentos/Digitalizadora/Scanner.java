package POO.Interface.equipamentos.Digitalizadora;

public class Scanner implements Digitalizadora { // digitalizadora = interface; inves e usar extends, usamos implements
    public void digitalizar(){
        System.out.println("Digitalizando");
    }
}

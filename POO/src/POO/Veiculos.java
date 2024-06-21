package POO;

public abstract class Veiculos { //abstract nao sabe como funciona, mas todo VEICULO temm q ter oq eu tenho:
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar();
}

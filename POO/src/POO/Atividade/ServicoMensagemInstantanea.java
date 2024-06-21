package POO.Atividade;

public abstract class ServicoMensagemInstantanea { // toda classe que chamar o metodo abaixo, vai chamar do seu jeito
    public abstract void enviarMensagem();      // abstrac, metodo nao instanciado sozinho, precisa de um compplemento. (do seu jeito)
	public abstract void receberMensagem();	    // metodos abstract NAO tem corpo (sysout).

    //somente os filhos conhecem este método
 protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	    // protected = so classes filhas e do mesmo pacote
}
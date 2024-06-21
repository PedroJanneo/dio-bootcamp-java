package POO.Atividade;

public class MsgFacebook extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}

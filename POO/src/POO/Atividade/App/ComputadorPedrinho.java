package POO.Atividade.App;

import POO.Atividade.MSNMessenger;
import POO.Atividade.MsgFacebook;
import POO.Atividade.MsgTelegram;
import POO.Atividade.ServicoMensagemInstantanea;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new MsgFacebook();
		else if(appEscolhido.equals("tlg"))
			smi = new MsgTelegram();
		
			// polimorfismo : nao sei qm é, mas vou executar conforme solicitado
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}
}
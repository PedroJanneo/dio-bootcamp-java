public class Casos {
    public static void main(String[] args) {
       

		String sigla = "M";

		switch (sigla) { // switch case -> igual um if e varios elif (soq mais resumido e visualmente mais bnto)
		case "P":{
			System.out.println("PEQUENO");
			break; // nao esquecer do break 
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default: // caso nao seja nenhum dos anteriores, cai nessa opção
			System.out.println("INDEFINIDO");
		}
        String plano = "M"; // M / T

        switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
        // sem os break, quando cair na opção M, ira imprimir o 'B' tambem, em casos, isso é valido, e outros nao...
    }
}

public class Repeticoes {
    public static void main(String[] args) {

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) { // loop = ate carneirinhs ( que é 1) chear a
                                                                         // 20, ele vai repetir oq tiver dentro
            System.out.println(carneirinhos + " - Carneirinho(s)"); // do bloco
        }

        // for com array
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" }; // o valor da array começa com 0
            // x = variavel  auxiliar       alunos = variavel 'real'
        for (int x  = 0; x < alunos.length; x++) {  // .length = tamanho
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        String alunos2 [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
    //    : a cada execucao do aluno, o alunos2 ganha um novo valor
	for(String aluno : alunos2) {  //Forma abreviada/ for each
	  System.out.println("O nome do aluno é " + aluno);
	}






    }

}

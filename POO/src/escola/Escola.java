package escola;

public class Escola {
    public static void main(String[] args) {
        
    
    Aluno felipe = new Aluno();
		felipe.setNome("Peu"); // set = dar; get = pegar
		felipe.setIdade(19);
        felipe.setSexo("Homem");

		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos " + felipe.getSexo());
		
}
}
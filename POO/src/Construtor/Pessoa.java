package Construtor;

public class Pessoa {
    private String nome;
	private String cpf;
	private String endereco;
	
    public Pessoa (String cpf, String nome){ // construtor substitui o SET; nao pode ter o tipo de tetorno, diferente do METODO
        this.cpf = cpf;
        this.nome = nome;       // no construtor pode ter e não ter parametros
    }
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}

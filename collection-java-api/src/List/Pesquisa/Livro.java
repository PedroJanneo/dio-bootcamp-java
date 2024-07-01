package List.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int publicacao;



    public Livro(String titulo, String autor, int publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacao = publicacao;
    }



    public String getTitulo() {
        return titulo;
    }



    public String getAutor() {
        return autor;
    }



    public int getPublicacao() {
        return publicacao;
    }



 
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", publicacao=" + publicacao + "]";
    }

    

    
}

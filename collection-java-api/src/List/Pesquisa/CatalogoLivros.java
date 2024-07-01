package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livroslist;

    public CatalogoLivros() {
        this.livroslist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int publicacao){
        livroslist.add(new Livro(titulo, autor, publicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroslist.isEmpty()){
            for (Livro l : livroslist){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno( int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!livroslist.isEmpty()){
           for (Livro l : livroslist) {
            if (l.getPublicacao() >= anoInicial && l.getPublicacao() <= anoFinal){
                livroPorIntervaloAnos.add(l);
            }
           }
    }
    return livroPorIntervaloAnos;
}
    public Livro pesquisarPortitulo( String titulo){
        Livro livroPorTitulo = null;
        if (!livroslist.isEmpty()){
            for (Livro l : livroslist) {    
                    if ( l.getTitulo().equalsIgnoreCase(titulo)){
                        livroPorTitulo = l;
                        break;
                    }

            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();
    
        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
    
        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
    
        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));
    
        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2010, 2022));
    
        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2025, 2030));
    
        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPortitulo("Java Guia do Programador"));
    
        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPortitulo("Título Inexistente"));
      }
    }
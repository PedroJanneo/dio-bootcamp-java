package List.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoa() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoa.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
        if (!listaPessoa.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
          OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();
      
          // Adicionando pessoas à lista
          ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
          ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
          ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
          ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
      
          // Exibindo a lista de pessoas adicionadas
          System.out.println(ordenacaoPessoas.listaPessoa);
      
          // Ordenando e exibindo por idade
          System.out.println(ordenacaoPessoas.ordenarPorIdade());
      
          // Ordenando e exibindo por altura
          System.out.println(ordenacaoPessoas.ordenarPorAltura());
        }
      }

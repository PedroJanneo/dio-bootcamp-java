package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefa() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();

      System.out.println(listatarefa.obterNumeroTotalTarefa());  

      listatarefa.adicionarTarefa("Tarefa 1");
      listatarefa.adicionarTarefa("Tarefa 1");
      listatarefa.adicionarTarefa("Tarefa 2");
      System.out.println(listatarefa.obterNumeroTotalTarefa());  
        listatarefa.removerTarefa("Tarefa 2");
        System.out.println(listatarefa.obterNumeroTotalTarefa());  
        listatarefa.obterDescricoesTarefas();


    }
}

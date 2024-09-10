package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
//atributo
    private List<Tarefa> tarefaList;

    public ListaDeTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //estudar
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaDeTarefas listaTarefa = new ListaDeTarefas();
        System.out.println("O Numero Total de elemtnos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O Numero Total de elemtnos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O Numero Total de elemtnos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
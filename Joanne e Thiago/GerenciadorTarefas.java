public class GerenciadorTarefas {
    Tarefas t = new Tarefas();
    public void adicionarTarefa(String tarefa) {
        t.adicionarTarefa(tarefa);
    }
    public void removerTarefa(String tarefa) {
        t.removerTarefa(tarefa);
    }
    public void listarTarefas() {
        t.listarTarefas();
    }
}

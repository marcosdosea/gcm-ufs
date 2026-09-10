public class Branch_Cliente {
    public void Inserir(Cliente cliente){
        salvarCliente(cliente);
    }
    public void Remover(Cliente cliente){
        deleteCliente(cliente);
    }
}
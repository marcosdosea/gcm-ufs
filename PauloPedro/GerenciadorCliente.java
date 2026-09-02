public class GerenciadorCliente{
    private List<Cliente> clientes = new ArrayList<>();

    public void inserir(Cliente cliente){
        clientes.add(cliente);
        System.out.println("Cliente cadastrado!");
    }

    public void atualizar(Cliente cliente) {
        // TODO: implementar atualização de cliente
    }
}
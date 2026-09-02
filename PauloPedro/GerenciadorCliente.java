public class GerenciadorCliente{
    private List<Cliente> clientes = new ArrayList<>();

    public void inserir(Cliente cliente){
        Cliente novoCliente = new Cliente(cliente);
        clientes.add(novoCliente);
        System.out.println("Cliente cadastrado!");
    }

    public void atualizar(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.getId() == cliente.getId()) {
                c.atualizar(cliente);
                break;       
            }
        }
    }
}
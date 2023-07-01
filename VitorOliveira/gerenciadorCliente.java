public class gerenciadorCliente {
    private ArrayList<Cliente> clientes;
    private int qtdClientes;

    public gerenciadorCliente() {
        this.clientes = new ArrayList<Cliente>();
        this.qtdClientes = 0;
    }

    public void inserirCliente(Cliente cliente) {
        this.clientes.add(cliente);
        this.qtdClientes++;
    }

    public Cliente consultarCliente(String cpf) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}
import java.util.ArrayList;

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

    public void removerCliente(String cpf) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCpf().equals(cpf)) {
                this.clientes.remove(cliente);
                this.qtdClientes--;
                break;
            }
        }
    }

    public void alterarCliente(String cpf, Cliente cliente) {
        for (Cliente clienteAtual : this.clientes) {
            if (clienteAtual.getCpf().equals(cpf)) {
                clienteAtual.setNome(cliente.getNome());
                clienteAtual.setCpf(cliente.getCpf());
                clienteAtual.setEndereco(cliente.getEndereco());
                clienteAtual.setTelefone(cliente.getTelefone());
                break;
            }
        }
    }
}
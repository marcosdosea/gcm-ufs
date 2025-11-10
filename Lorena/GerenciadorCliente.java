import java.util.ArrayList;
import java.util.List;
public class GerenciadorCliente {
    private List<Cliente> clientes;

    public GerenciadorCliente() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente buscarClientePorEmail(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return cliente;
            }
        }
        return null;
    }
    public Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public void exibirClientePesquisado(Cliente cliente) {
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Email: " + cliente.getEmail());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    } 
    public void removerClientePorId(int id) {
        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            clientes.remove(cliente);
        }
    }
    public void removerClientePorNome(String nome) {
        Cliente cliente = buscarClientePorNome(nome);
        if (cliente != null) {
            clientes.remove(cliente);
        }
    }
    public void atualizarClienteNome(Cliente cliente, String novoNome) {
        cliente.setNome(novoNome);
    }
    public void atualizarClienteEmail(Cliente cliente, String novoEmail) {
        cliente.setEmail(novoEmail);
    }
}
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeClientes {
    private Map<String, Cliente> clientes;

    public GerenciadorDeClientes() {
        this.clientes = new HashMap<>();
    }

    // Método para adicionar um cliente
    public void adicionarCliente(String id, Cliente cliente) {
        if (clientes.containsKey(id)) {
            System.out.println("Cliente com ID " + id + " já existe.");
        } else {
            clientes.put(id, cliente);
            System.out.println("Cliente adicionado com sucesso: " + cliente);
        }
    }

    // Método para alterar um cliente
    public void alterarCliente(String id, Cliente novoCliente) {
        if (clientes.containsKey(id)) {
            clientes.put(id, novoCliente);
            System.out.println("Cliente atualizado com sucesso: " + novoCliente);
        } else {
            System.out.println("Cliente com ID " + id + " não encontrado.");
        }
    }

    // Método para exibir um cliente
    public Cliente exibirCliente(String id) {
        return clientes.get(id);
    }
}

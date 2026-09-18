import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
    private List<Cliente> clientes;

    public GerenciadorCliente() {
        this.clientes = new ArrayList<>();
    }

    public void inserir(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente consultar(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public boolean remover(String id) {
        Cliente cliente = consultar(id);
        if (cliente != null) {
            clientes.remove(cliente);
            return true;
        }
        return false;
    }
 
    public boolean alterar(String id, String novoNome, String novoEmail) {
        Cliente cliente = consultar(id);
        if (cliente != null) {
            cliente.setNome(novoNome);
            cliente.setEmail(novoEmail);
            return true;
        }
        return false;
    }

}
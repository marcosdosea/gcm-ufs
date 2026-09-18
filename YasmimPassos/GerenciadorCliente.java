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

}
import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {

    private List<Cliente> clientes = new ArrayList<>();

    
    public void inserir(Cliente cliente) {
        clientes.add(cliente);
    }

    
    public Cliente consultar(int id) {
        for (Cliente c : clientes) {
            if (c.getid() == id) {
                return c;
            }
        }
        return null;
    }
}

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {

    private List<Cliente> clientes = new ArrayList<>();

    //metodo para inserir
    public void inserir(Cliente cliente) {
        clientes.add(cliente);
    }

    //metodo para consultar
    public Cliente consultar(int id) {
        for (Cliente c : clientes) {
            if (c.getid() == id) {
                return c;
            }
        }
        return null;
    }
    
    // remove cliente pelo ID
    public boolean remover(int id) {
        Cliente cliente = consultar(id);
        if (cliente != null) {
            clientes.remove(cliente);
            return true;
        }
        return false;
    }

    // altera substituindo os dados do cliente existente
    public boolean alterar(Cliente clienteAlterado) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == clienteAlterado.getId()) {
                clientes.set(i, clienteAlterado);
                return true;
            }
        }
        return false;
    }
}

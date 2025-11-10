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
}

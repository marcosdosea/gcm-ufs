import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorCliente {
    private final List<Cliente> clientes = new ArrayList<>();

    public void inserir(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        clientes.add(cliente);
    }

    public List<Cliente> consultar() {
        return Collections.unmodifiableList(new ArrayList<>(clientes));
    }
}
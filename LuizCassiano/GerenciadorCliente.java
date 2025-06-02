import java.util.ArrayList;

public class GerenciadorCliente {
    private ArrayList<Cliente> clientes;

    public GerenciadorCliente() {
        clientes = new ArrayList<>();
    }

    public void inserir(Cliente cliente) {
    	clientes.add(cliente);
    }

}

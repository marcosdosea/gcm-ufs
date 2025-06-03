import java.util.ArrayList;

public class GerenciadorCliente {
    private ArrayList<Cliente> clientes;

    public GerenciadorCliente() {
        clientes = new ArrayList<>();
    }

    public void inserir(Cliente cliente) {
    	clientes.add(cliente);
    }

    public void atualizar(int index, Cliente cliente) {
        if (index >= 0 && index < clientes.size()) {
            clientes.set(index, cliente);
        } else {
            System.out.println("Índice inválido.");
        }
    }

}


import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
    private List<String> clientes = new ArrayList<>();

    public void inserir(String cliente) {
        clientes.add(cliente);
        System.out.println("Cliente inserido: " + cliente);
    }

    public void consultar() {
        System.out.println("Lista de clientes:");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void remover(String cliente) {
        if (clientes.remove(cliente)) {
            System.out.println("Cliente removido: " + cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void alterar(String clienteAntigo, String clienteNovo) {
        int index = clientes.indexOf(clienteAntigo);
        if (index != -1) {
            clientes.set(index, clienteNovo);
            System.out.println("Cliente alterado para: " + clienteNovo);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}


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

    public void remover(){
        if (!clientes.isEmpty()) {
            String clienteRemovido = clientes.remove(clientes.size() - 1);
            System.out.println("Cliente removido: " + clienteRemovido);
        } else {
            System.out.println("Nenhum cliente para remover.");
        }
    }

    public void alterar(){
        if (!clientes.isEmpty()) {
            String clienteAlterado = clientes.get(0);
            clientes.set(0, clienteAlterado + " (alterado)");
            System.out.println("Cliente alterado: " + clientes.get(0));
        } else {
            System.out.println("Nenhum cliente para alterar.");
        }
    }
    
}

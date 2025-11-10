import java.util.HashMap;
import java.util.Map;

public class GerenciadorCliente {
    private Map<Integer, String> clientes;

    public GerenciadorCliente() {
        clientes = new HashMap<>();
    }
    //Metodo Inserir um novo cliente no gerenciador
    public void inserir(int id, String nome) {
        clientes.put(id, nome);
        System.out.println("Cliente inserido: " + nome);
    }
    //Metodo consultar um cliente no gerenciador
    public String consultar(int id) {
        if (clientes.containsKey(id)) {
            return "Cliente encontrado: " + clientes.get(id);
        } else {
            return "Cliente não encontrado.";
        }
    }

    public void remover(int id) {
        if (clientes.containsKey(id)) {
            clientes.remove(id);
            System.out.println("Cliente removido com sucesso.");
        } else {
            System.out.println("Cliente não encontrado para remoção.");
        }
    }

    public void alterar(int id, String novoNome) {
        if (clientes.containsKey(id)) {
            clientes.put(id, novoNome);
            System.out.println("Cliente atualizado: " + novoNome);
        } else {
            System.out.println("Cliente não encontrado para alteração.");
        }
    }
}

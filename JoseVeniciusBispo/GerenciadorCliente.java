import java.util.HashMap;
import java.util.Map;

public class GerenciadorCliente {
    private Map<Integer, String> clientes;

    public GerenciadorCliente() {
        clientes = new HashMap<>();
    }

    public void inserir(int id, String nome) {
        clientes.put(id, nome);
        System.out.println("Cliente inserido com sucesso: " + nome);
    }

    public String consultar(int id) {
        if (clientes.containsKey(id)) {
            return "Cliente encontrado: " + clientes.get(id);
        } else {
            return "Cliente não encontrado.";
        }
    }
}

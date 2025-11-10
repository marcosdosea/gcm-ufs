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
        System.out.println("Cliente inserido com sucesso: " + nome);
    }
    //Metodo consultar um cliente no gerenciador
    public String consultar(int id) {
        if (clientes.containsKey(id)) {
            return "Cliente encontrado: " + clientes.get(id);
        } else {
            return "Cliente não encontrado.";
        }
    }
}

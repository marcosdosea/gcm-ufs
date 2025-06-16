
import java.util.HashMap;
import java.util.Map;

public class GerenciadorCliente {
    // Usando um Map para simular um banco de dados em memória
    private Map<Integer, Cliente> clientes = new HashMap<>();
    private int proximoId = 1;

    /**
     * Cria e armazena um novo cliente.
     * @param nome O nome do cliente.
     * @param email O email do cliente.
     * @return O objeto Cliente criado.
     */
    public Cliente inserir(String nome, String email) {
        int id = proximoId++;
        Cliente novoCliente = new Cliente(id, nome, email);
        clientes.put(id, novoCliente);
        System.out.println("INFO: Cliente '" + nome + "' inserido com sucesso com ID " + id + ".");
        return novoCliente;
    }

    /**
     * Consulta um cliente pelo seu ID.
     * @param idCliente O ID do cliente a ser buscado.
     * @return O objeto Cliente se encontrado, caso contrário, null.
     */
    public Cliente consultar(int idCliente) {
        return clientes.get(idCliente);
    }
}
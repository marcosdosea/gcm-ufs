
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
    
// --- NOVOS MÉTODOS DA ISSUE 2 ---

    /**
     * Altera os dados de um cliente existente.
     * Apenas os parâmetros não nulos serão alterados.
     * @param idCliente O ID do cliente a ser alterado.
     * @param novoNome O novo nome (ou null para não alterar).
     * @param novoEmail O novo email (ou null para não alterar).
     * @return true se a alteração foi bem-sucedida, false caso contrário.
     */
    public boolean alterar(int idCliente, String novoNome, String novoEmail) {
        Cliente cliente = consultar(idCliente);
        if (cliente != null) {
            if (novoNome != null) {
                cliente.setNome(novoNome);
            }
            if (novoEmail != null) {
                cliente.setEmail(novoEmail);
            }
            System.out.println("INFO: Cliente ID " + idCliente + " alterado com sucesso.");
            return true;
        }
        System.out.println("ERRO: Cliente com ID " + idCliente + " não encontrado para alteração.");
        return false;
    }

    /**
     * Remove um cliente do sistema pelo seu ID.
     * @param idCliente O ID do cliente a ser removido.
     * @return true se a remoção foi bem-sucedida, false caso contrário.
     */
    public boolean remover(int idCliente) {
        if (clientes.containsKey(idCliente)) {
            String nomeCliente = clientes.get(idCliente).getNome();
            clientes.remove(idCliente);
            System.out.println("INFO: Cliente '" + nomeCliente + "' (ID: " + idCliente + ") removido com sucesso.");
            return true;
        }
        System.out.println("ERRO: Cliente com ID " + idCliente + " não encontrado para remoção.");
        return false;
    }
}
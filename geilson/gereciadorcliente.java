/*GerenciadorCliente.java*/
javapackage [SeuNome][SeuSobrenome];

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar operações de clientes
 * @author [Seu Nome]
 * @version 1.0
 */
public class GerenciadorCliente {
    private List<Cliente> clientes;
    
    public GerenciadorCliente() {
        this.clientes = new ArrayList<>();
    }
    
    /**
     * Insere um novo cliente na lista
     * @param cliente Cliente a ser inserido
     * @return true se inserido com sucesso
     */
    public boolean inserir(Cliente cliente) {
        if (cliente != null) {
            return clientes.add(cliente);
        }
        return false;
    }
    
    /**
     * Consulta cliente por ID
     * @param id ID do cliente
     * @return Cliente encontrado ou null
     */
    public Cliente consultar(int id) {
        return clientes.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }


 /*Adicionar ao GerenciadorCliente.java:*/
java/**
 * Remove cliente por ID
 * @param id ID do cliente a ser removido
 * @return true se removido com sucesso
 */
public boolean remover(int id) {
    return clientes.removeIf(c -> c.getId() == id);
}

/**
 * Altera dados de um cliente existente
 * @param cliente Cliente com dados atualizados
 * @return true se alterado com sucesso
 */
public boolean alterar(Cliente cliente) {
    if (cliente == null) return false;
    
    for (int i = 0; i < clientes.size(); i++) {
        if (clientes.get(i).getId() == cliente.getId()) {
            clientes.set(i, cliente);
            return true;
        }
    }
    return false;
}

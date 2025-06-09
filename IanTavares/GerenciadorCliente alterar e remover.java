import java.util.HashMap;
import java.util.Map;

class Cliente {
    private String id;
    private String nome;

    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{id='" + id + "', nome='" + nome + "'}";
    }
}

class GerenciadorCliente {
    private Map<String, Cliente> clientes = new HashMap<>();

    // Adiciona um cliente
    public void inserir(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }

    // Consulta um cliente pelo identificador
    public Cliente consultar(String identificador) {
        return clientes.get(identificador);
    }

    // Remove um cliente pelo identificador
    public void remover(String identificador) {
        clientes.remove(identificador);
    }

    // Altera os dados de um cliente existente
    public void alterar(Cliente clienteAtualizado) {
        if (clientes.containsKey(clienteAtualizado.getId())) {
            clientes.put(clienteAtualizado.getId(), clienteAtualizado);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GerenciadorCliente gerenciador = new GerenciadorCliente();

        // Inserindo clientes
        gerenciador.inserir(new Cliente("001", "Ana"));
        gerenciador.inserir(new Cliente("002", "Carlos"));

        // Consultando cliente
        System.out.println("Consulta: " + gerenciador.consultar("001"));

        // Alterando cliente
        gerenciador.alterar(new Cliente("002", "Carlos Silva"));
        System.out.println("Após alteração: " + gerenciador.consultar("002"));

        // Removendo cliente
        gerenciador.remover("001");
        System.out.println("Após remoção: " + gerenciador.consultar("001"));  // Deve mostrar null
    }
}

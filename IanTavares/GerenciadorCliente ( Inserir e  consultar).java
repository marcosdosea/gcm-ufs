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

    
    public String toString() {
        return "Cliente{id='" + id + "', nome='" + nome + "'}";
    }
}

class GerenciadorCliente {
    private Map<String, Cliente> clientes = new HashMap<>();

    public void inserir(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }

    public Cliente consultar(String identificador) {
        return clientes.get(identificador);
    }
}

public class Main {
    public static void main(String[] args) {
        GerenciadorCliente gerenciador = new GerenciadorCliente();

        gerenciador.inserir(new Cliente("001", "João"));
        gerenciador.inserir(new Cliente("002", "Maria"));

        Cliente cliente = gerenciador.consultar("002");
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}

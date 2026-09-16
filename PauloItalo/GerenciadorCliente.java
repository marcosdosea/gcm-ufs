import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
    private final List<Cliente> clientes = new ArrayList<>();

    public void inserir(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        clientes.add(cliente);
    }

    public Cliente consultar(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }

        return clientes.stream()
                .filter(clienteCadastrado -> clienteCadastrado.equals(cliente))
                .findFirst()
                .orElse(null);
    }

    public boolean remover(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }

        return clientes.remove(cliente);
    }

    public void alterar(Cliente cliente, String nome, String cpf, String telefone) {
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
    }
}
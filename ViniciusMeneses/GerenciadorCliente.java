package ViniciusMeneses;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
    private List<Cliente> clientes = new ArrayList<>();

    public void inserir(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente consultar(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }
}

public boolean remover(String id) {
        Cliente cliente = consultar(id);
        if (cliente != null) {
            clientes.remove(cliente);
            return true;
        }
        return false;
    }

    public boolean alterar(Cliente clienteAtualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(clienteAtualizado.getId())) {
                clientes.set(i, clienteAtualizado);
                return true;
            }
        }
        return false;
    }
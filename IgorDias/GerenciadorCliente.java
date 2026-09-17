package IgorDias;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
    private final List<String> clientes = new ArrayList<>();

    public void inserir(String cliente) {
        clientes.add(cliente);
    }

    public String consultar(int posicao) {
        if (posicao < 0 || posicao >= clientes.size()) {
            return null;
        }

        return clientes.get(posicao);
    }

    public boolean remover(int posicao) {
        if (posicao < 0 || posicao >= clientes.size()) {
            return false;
        }

        clientes.remove(posicao);
        return true;
    }

    public boolean alterar(int posicao, String cliente) {
        if (posicao < 0 || posicao >= clientes.size()) {
            return false;
        }

        clientes.set(posicao, cliente);
        return true;
    }
}
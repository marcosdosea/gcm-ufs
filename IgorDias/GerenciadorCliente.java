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
}

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
    private List<String> clientes = new ArrayList<>();

    public void inserir(String cliente) {
        clientes.add(cliente);
        System.out.println("Cliente inserido: " + cliente);
    }

    public void consultar() {
        System.out.println("Lista de clientes:");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }
    }

    
}

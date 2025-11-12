import java.util.ArrayList;

public class GerenciadorCliente {

    private ArrayList<String> clientes;

    public GerenciadorCliente() {
        clientes = new ArrayList<>();
    }

    public void inserir(String nome) {
        clientes.add(nome);
        System.out.println("Cliente inserido: " + nome);
    }

    public boolean consultar(String nome) {
        return clientes.contains(nome);
    }
}

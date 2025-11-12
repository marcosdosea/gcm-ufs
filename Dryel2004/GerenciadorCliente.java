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

    public void remover(String nome) { 
        if (clientes.remove(nome)) {
            System.out.println("Cliente removido: " + nome);
        } else {
            System.out.println("Cliente não encontrado: " + nome);
        }
    }

    public void alterar(String nomeAntigo, String nomeNovo) {
        int indice = clientes.indexOf(nomeAntigo);
        if (indice != -1) {
            clientes.set(indice, nomeNovo);
            System.out.println("Cliente alterado de " + nomeAntigo + " para " + nomeNovo);
        } else {
            System.out.println("Cliente não encontrado: " + nomeAntigo);
        }
    }
}

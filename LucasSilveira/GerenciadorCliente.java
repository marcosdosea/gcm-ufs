import java.util.ArrayList;

public class GerenciadorCliente {
    private ArrayList<String> clientes = new ArrayList<>();

    public void inserir(String nome) {
        clientes.add(nome);
    }

    public void consultar() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Clientes:");
            for (String nome : clientes) {
                System.out.println("- " + nome);
            }
        }
    }
    
    public void remover(String nome) {
        if (clientes.remove(nome)) {
            System.out.println("Cliente '" + nome + "' removido com sucesso!");
        } else {
            System.out.println("Cliente '" + nome + "' não encontrado.");
        }
    }

    public void alterar(String nomeAntigo, String nomeNovo) {
        int index = clientes.indexOf(nomeAntigo);
        if (index != -1) {
            clientes.set(index, nomeNovo);
            System.out.println("Cliente '" + nomeAntigo + "' alterado para '" + nomeNovo + "'.");
        } else {
            System.out.println("Cliente '" + nomeAntigo + "' não encontrado.");
        }
    }
}
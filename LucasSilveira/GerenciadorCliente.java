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
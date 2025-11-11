public class GerenciadorCliente {
    private List<String> clientes;

    public void inserirCliente(String nome) {
        clientes.add(nome);
        System.out.println("Cliente \"" + nome + "\" inserido com sucesso!");
    }

    public void consultarClientes() {
        System.out.println("---- Lista de Clientes ----");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (String cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
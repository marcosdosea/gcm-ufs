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

    public void removerCliente(String nome) {
        if (clientes.remove(nome)) {
            System.out.println("Cliente \"" + nome + "\" removido com sucesso!");
        } else {
            System.out.println("Cliente \"" + nome + "\" não encontrado.");
        }
    }

    public void alterarCliente(String nomeAntigo, String nomeNovo) {
        int indice = clientes.indexOf(nomeAntigo);
        if (indice != -1) {
            clientes.set(indice, nomeNovo);
            System.out.println("Cliente \"" + nomeAntigo + "\" alterado para \"" + nomeNovo + "\" com sucesso!");
        } else {
            System.out.println("Cliente \"" + nomeAntigo + "\" não encontrado.");
        }
    }
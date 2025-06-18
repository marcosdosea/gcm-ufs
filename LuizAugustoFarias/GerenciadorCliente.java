public class GerenciadorCliente {
    public void inserir(String nome) {
        System.out.println("Cliente " + nome + " inserido.");
    }

    public void consultar() {
        System.out.println("Consulta de clientes realizada.");
    }

    public void remover(String nome) {
        System.out.println("Cliente " + nome + " removido.");
    }

    public void alterar(String nomeAntigo, String nomeNovo) {
        System.out.println("Cliente " + nomeAntigo + " alterado para " + nomeNovo + ".");
    }
}
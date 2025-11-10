public class main {
    public static void main(String[] args) {
        GerenciadorCliente gerenciador = new GerenciadorCliente();

        Cliente cliente1 = new Cliente(1, "Alice", "alice@example.com");
        Cliente cliente2 = new Cliente(2, "Bob", "bob@example.com");

        gerenciador.adicionarCliente(cliente1);
        gerenciador.adicionarCliente(cliente2);
        Cliente buscaPorId = gerenciador.buscarClientePorId(1);
        gerenciador.exibirClientePesquisado(buscaPorId);
    }
}

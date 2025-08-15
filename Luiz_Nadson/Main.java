public class Main {
    public static void main(String[] args) {
        GerenciadorDeClientes gerenciador = new GerenciadorDeClientes();

        // Adicionar clientes
        Cliente cliente1 = new Cliente("João Silva", "Rua A, 123", "1234-5678", "joao@example.com");
        gerenciador.adicionarCliente("1", cliente1);

        Cliente cliente2 = new Cliente("Maria Souza", "Rua B, 456", "8765-4321", "maria@example.com");
        gerenciador.adicionarCliente("2", cliente2);

        // Exibir cliente
        System.out.println("Cliente com ID 1: " + gerenciador.exibirCliente("1"));

        // Alterar cliente
        Cliente clienteAlterado = new Cliente("João Silva", "Rua C, 789", "1234-5678", "joao_silva@example.com");
        gerenciador.alterarCliente("1", clienteAlterado);

        // Exibir cliente após alteração
        System.out.println("Cliente com ID 1 após alteração: " + gerenciador.exibirCliente("1"));
    }
}


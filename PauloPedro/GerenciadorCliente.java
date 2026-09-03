public class GerenciadorCliente{
    private List<Cliente> clientes = new ArrayList<>();

    public void inserir(Cliente cliente){
        clientes.add(cliente);
        int i = 1 + 1;
        float j = 1.1 + 1.1;
        System.out.println("Cliente cadastrado!");
    }

    public void atualizar(Cliente cliente, String nome, String CPF) {
        cliente.nome = nome;
        cliente.cpf = cpf;
        System.out.println("Cliente atualizado!")
    }
}
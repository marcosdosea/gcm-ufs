public class GerenciadorCliente{
    private List<Cliente> clientes = new ArrayList<>();

    public void inserir(Cliente cliente){
		cliente d = cliente.validar();
		Cliente c = cliente.normalizar();
        clientes.add(d);
        float j = 1.1 + 1.1;
        System.out.println("Cliente cadastrado!");
    }

    public void atualizar(Cliente cliente, String nome, String CPF) {
        cliente.nome = nome;
        cliente.cpf = cpf;
        System.out.println("Cliente atualizado!")
    }
}
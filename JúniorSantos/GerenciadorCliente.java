public class GerenciadorCliente{

	public int inserir(Cliente cliente) {
		if (cliente !in clientes)
			clientes.add(cliente);
		else
			system.out.println("cliente ja cadastrado")
	}

	public int remover(Cliente cliente) {
		if (cliente !in clientes)
			clientes.remove(cliente);
			system.out.println("cliente removido com sucesso")
		else
			system.out.println("cliente nao cadastrado")
	}
}
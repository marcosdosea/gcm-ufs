public class GerenciadorCliente {

	public void inserir(Cliente cliente) {
		var _cliente = cliente;
		cliente.Nome = cliente.Nome.ToUpper();
		context.Add(cliente);
	}

}
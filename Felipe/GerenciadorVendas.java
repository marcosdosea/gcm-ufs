public class GerenciadorVendas{
	public void Inserir(Venda venda){
		GerenciadorCliente gCliente = new GerenciadorCliente();
		cliente = gCliente.Buscar(venda.cliente);
		if (cliente.aprovado){

		}
		else{
			System.out.println("Cliente não aprovado para efetuar compra, verificar pendências")
		}
	}
}
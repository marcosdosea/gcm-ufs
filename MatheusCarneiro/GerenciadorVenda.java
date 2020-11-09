public class GerenciadorVenda {
	public static void main(String args[]) {
		GerenciadorCliente ger = new GerenciadorCliente();
		Cliente cli = new Cliente();
		ger.inserir(cli);
		ger.excluir(cli);
	}
}
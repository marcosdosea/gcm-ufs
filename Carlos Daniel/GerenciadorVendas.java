package PDDS;

public class GerenciadorVendas{
	private int id = new int.Random();
	private GerenciadorCliente cliente = new GerenciadorCliente();

	public void fazerVenda(float preco, String nomeC){
		System.out.println(cliente.consultar(nomeC));
	}
}

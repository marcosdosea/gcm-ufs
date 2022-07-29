package PDDS;

public class GerenciadorCliente{
	private String nomeC;
	private int idadeC;

	public void inserirCliente(String nome, int idade){
		this.nomeC = nome;
		this.idadeC = idade;
	}

	public int consultarCliente(String nome){
		if(nome.equals(this.nomeC))
			return idadeC;
		else
			return -1;
	}
}
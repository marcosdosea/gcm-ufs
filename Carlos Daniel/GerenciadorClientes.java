package PDDS;

public class GerenciadorCliente{
	private String nome;
	private int idade;

	public void inserirCliente(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	public String consultarCliente(String nome){
		if(nome.equals(this.nomeC))
			return nomeC;
		else{
			System.out.println("Não há informações desse cliente no sistema.")
			return new String("-1");
		}
	}

	public boolean remover(String nome){
		if(nome.equals(this.nomeC)){
			nomeC = null;
			idadeC = -1;

			return true;
		}
		else
			return false;
	}

	public void alterar(String nome, int idade){
		this.nomeC = nome;
		this.idadeC = idade;
	}
}

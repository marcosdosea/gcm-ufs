import java.util.ArrayList

public class Cliente{
	private ArrayList<String> cliente = new ArrayList<String> ();
	private String nome;

	//Contrutor para a classe Cilente
	public Cliente (String nome){
		this.nome = nome
	}
	//adicionando cliente na lista
	public void InserirCliente(String nome){
		this.cliente.add(nome)	
	
	}
	//removendo o cliente da lista
	public void RemoverCliente (String nome){
		this.cliente.add(nome)
	}	
}
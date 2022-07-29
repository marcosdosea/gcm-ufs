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
	//consultando o cliente da lista
	public void RemoverCliente (String nome){
		for(String cont : cliente){		
			if (cont.equals(nome))
				Systen.out.println(cliente)
			else
				Systme.out.println("Cliente nao encrontado")
		}
	}	
}
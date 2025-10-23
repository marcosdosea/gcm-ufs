public class GerenciadorCliente{
	public void Atualizar(Cliente cliente, nome){
		if(cliente.exists()){
			cliente.nome = nome;
		}		
	}
	public void inserir(){
		System.Out.Println("Cliente inserido com sucesso!");
	}
}
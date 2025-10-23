public class GerenciadorCliente{
	public void Atualizar(Cliente cliente, nome){
		if(cliente.exists()){
			cliente.nome = nome;
		}		
	}
}
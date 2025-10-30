public class GerenciadorCLiente {
	public void inserir(){
		System.Out.Println("Cliente inserido com sucesso!");
	}
    
	public void Atualizar(Cliente cliente, nome){
		if(cliente.exists()){
			cliente.nome = nome;
		}		
	}
}

public class GerenciadorCliente {

	public void inserir(Cliente cliente){
	   Util.ValidarCpf(cliente.cpf);
	   context.Save();
	}
	
	public void atualizar() {
		//TODO: implementar atualização
	}

}

package teste;

public class GerenciadorCliente(){
	
	public int idCliente;
	public String nomeCliente;

    public void status(){
        System.out.println("ID: "+ this.idCliente);
        System.out.println("Nome "+ this.nomeCliente);
		
    }
	  
	public int inserir(Cliente cliente) {
		this.idCliente = cliente.idCliente;
		this.nomeCliente = cliente.nomeCliente;
		return 1;
	}
	
	public void atualizar(Cliente cliente){
		//codigo de atualizar cliente
		updateName.addActionListener(
 		new AtualizandoRegistro( idCliente,nomeCliente ) );
 		add( updateName );
	
	}
	
}


public class GerenciadorVendas{
	GerenciadorCliente gc = new GerenciadorCliente();

	public void vender(){
		gc.inserir(new Cliente("dosea"));	
	}
}